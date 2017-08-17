package br.ufpr.dinf.gres.opla.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Entity
@Table(name = "objectives")
public class Objective implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "execution_id", nullable = false)
	private Execution execution;

	@Column(name = "objectives", columnDefinition = "TEXT")
	private String objectives;

	@Column(name = "is_all")
	private Integer isAll;

	@ManyToOne
	@JoinColumn(name = "experiement_id", nullable = false)
	private Experiment experiment;

	@Column(name = "solution_name")
	private String solutionName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Execution getExecution() {
		return execution;
	}

	public void setExecution(Execution execution) {
		this.execution = execution;
	}

	public String getObjectives() {
		return objectives;
	}

	public void setObjectives(String objectives) {
		this.objectives = objectives;
	}

	public Integer getIsAll() {
		return isAll;
	}

	public void setIsAll(Integer isAll) {
		this.isAll = isAll;
	}

	public Experiment getExperiment() {
		return experiment;
	}

	public void setExperiment(Experiment experiment) {
		this.experiment = experiment;
	}

	public String getSolutionName() {
		return solutionName;
	}

	public void setSolutionName(String solutionName) {
		this.solutionName = solutionName;
	}

	@Override
	public boolean equals(final Object other) {
		if (this == other) {
			return true;
		}
		if (other == null) {
			return false;
		}
		if (!getClass().equals(other.getClass())) {
			return false;
		}
		Objective castOther = (Objective) other;
		return Objects.equals(id, castOther.id) && Objects.equals(execution, castOther.execution)
				&& Objects.equals(objectives, castOther.objectives) && Objects.equals(isAll, castOther.isAll)
				&& Objects.equals(experiment, castOther.experiment)
				&& Objects.equals(solutionName, castOther.solutionName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, execution, objectives, isAll, experiment, solutionName);
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.SIMPLE_STYLE).append("id", id).append("executionId", execution)
				.append("objectives", objectives).append("isAll", isAll).append("experimentId", experiment)
				.append("solutionName", solutionName).toString();
	}

}