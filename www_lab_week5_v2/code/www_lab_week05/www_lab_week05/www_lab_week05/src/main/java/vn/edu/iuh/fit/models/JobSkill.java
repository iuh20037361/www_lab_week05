package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.edu.iuh.fit.enums.SkillLevel;
import vn.edu.iuh.fit.ids.JobSkillID;

@Entity
@Table(name = "job_skill")
@Data
@AllArgsConstructor
@NoArgsConstructor
@IdClass(JobSkillID.class)
public class JobSkill {
    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;
    @Id
    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;
    @Column(name = "more_infos", length = 1000)
    private String moreInfos;
    @Column(name = "skill_level", nullable = false)
    private SkillLevel skillLevel;



}
