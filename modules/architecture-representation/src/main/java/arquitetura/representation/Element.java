package arquitetura.representation;

import arquitetura.exceptions.ConcernNotFoundException;
import arquitetura.representation.relationship.GeneralizationRelationship;
import arquitetura.representation.relationship.Relationship;

import java.io.Serializable;
import java.util.*;

/**
 * @author edipofederle<edipofederle@gmail.com>
 */
public abstract class Element implements Serializable {

    private static final long serialVersionUID = 4736685073967472613L;

    protected String id;
    private String name;
    private VariationPoint variationPoint;
    private Variant variant;
    private Set<Concern> concerns = new HashSet<Concern>();
    private String typeElement;
    private String namespace;
    private boolean belongsToGeneralization;

    public Element() {
        id = "";
        name = "";
        variant = null;
        variationPoint = null;
        typeElement = "";
        namespace = "";
    }
    public Element(String name, Variant variant, String typeElement, String namespace, String id) {
        setId(id);
        setName(name);
        setVariant(variant);
        setTypeElement(typeElement);
        setNamespace(namespace);
    }

    public Set<Concern> getConcerns() {
        return concerns;
    }

    public void setConcerns(Set<Concern> concerns) {
        this.concerns = concerns;
    }

    public abstract Collection<Concern> getAllConcerns();

    public Set<Relationship> getRelationships() {
        return Collections.emptySet();
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    private void setId(String id) {
        this.id = id;
    }

    public String getTypeElement() {
        return this.typeElement;
    }

    protected void setTypeElement(String typeElement) {
        this.typeElement = typeElement;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean isVariationPoint() {
        return this.getVariationPoint() != null;
    }

    public Variant getVariant() {
        return variant;
    }

    public void setVariant(Variant variant) {
        this.variant = variant;
    }

    @Override
    public String toString() {
        return getName();
    }

    public boolean nameEquals(String name) {
        return getName().equalsIgnoreCase(name);
    }

    /**
     * Retorna apenas os interesses pertencentes a este elemento.<br />
     *
     * @return List<{@link Concern}>
     */
    public Set<Concern> getOwnConcerns() {
        if (concerns == null || concerns.isEmpty())
            return Collections.emptySet();
        return concerns;
    }

    public boolean containsConcern(Concern concern) {
        return concern != null && getOwnConcerns().stream().anyMatch(concern::namesMatch);
    }

    public boolean hasOnlyOneConcern(Concern concern) {
        return concern != null &&
                getOwnConcerns().size() == 1 &&
                getOwnConcerns().iterator().next().equals(concern);
    }

    /**
     * Métodos para adicionar um interesse diretamente,
     * pois é comum não precisar do NOME do interesse para repassá-lo ao elemento
     * <p>
     * Estes métodos não fazem nenhuma checagem ou criação de concern
     *
     * @param concern: um Concern VÁLIDO
     */
    public void addConcern(Concern concern) {
        concerns.add(concern);
    }

    /**
     * Métodos para adicionar um interesse diretamente,
     * pois é comum não precisar do NOME do interesse para repassá-lo ao elemento
     * <p>
     * Estes métodos não fazem nenhuma checagem ou criação de concern
     *
     * @param concernGroup: uma list de concerns VÁLIDOS
     */
    public void addConcerns(Concern... concernGroup) {
        Arrays.stream(concernGroup).forEach(this::addConcern);
    }

    /**
     * Métodos para adicionar um interesse diretamente,
     * pois é comum não precisar do NOME do interesse para repassá-lo ao elemento
     * <p>
     * Estes métodos não fazem nenhuma checagem ou criação de concern
     *
     * @param concernGroup: uma coleção(Set, List, etc...) de Concerns VÁLIDOS
     */
    public void addConcerns(Collection<Concern> concernGroup) {
        concernGroup.forEach(this::addConcern);
    }


    /**
     * Adiciona um interesse a classe.<br/>
     * <p>
     * Somente irá incluir o interesse se o mesmo estive presente no arquivo de
     * perfil que contêm os interesses</br>
     *
     * @param concernName
     * @throws ConcernNotFoundException
     */
    public void addConcern(String concernName) throws ConcernNotFoundException {
        Concern concern = ConcernHolder.INSTANCE.getOrCreateConcern(concernName);
        concerns.add(concern);
    }

    public void addConcerns(List<String> concernsNames) throws ConcernNotFoundException {
        for (String name : concernsNames)
            addConcern(name);
    }

    public void removeConcern(String concernName) {
        Concern concern = ConcernHolder.INSTANCE.getConcernByName(concernName);
        concerns.remove(concern);
    }


    /**
     * @return the namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * @return the variationPoint
     */
    public VariationPoint getVariationPoint() {
        return variationPoint;
    }

    /**
     * @param variationPoint the variationPoint to set
     */
    public void setVariationPoint(VariationPoint variationPoint) {
        this.variationPoint = variationPoint;
    }

    public boolean belongsToGeneralization() {
        return this.belongsToGeneralization;
    }

    public void setBelongsToGeneralization(boolean belongsToGeneralization) {
        this.belongsToGeneralization = belongsToGeneralization;
    }

    /**
     * Dado um {@link Element} retorna a {@link GeneralizationRelationship} no qual o mesmo pertence.
     *
     * @return {@link GeneralizationRelationship}
     * @see jmetal4.operators.mutation.PLAFeatureMutation#getGeneralizationRelationshipForClass(Element)
     */
    public GeneralizationRelationship getGeneralizationRelationship() {
        return getRelationships().stream()
                .filter(GeneralizationRelationship.class::isInstance)
                .map(GeneralizationRelationship.class::cast).findAny().orElse(null);
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((namespace == null) ? 0 : namespace.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (getClass() != obj.getClass()) return false;

        Element other = (Element) obj;
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }

        if (namespace == null) {
            if (other.namespace != null) {
                return false;
            }
        } else if (!namespace.equals(other.namespace)) {
            return false;
        }

        return true;
    }

}