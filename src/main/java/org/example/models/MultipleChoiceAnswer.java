package org.example.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "mc_ans")
public class MultipleChoiceAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int a_id;

    private int q_id;

    private String answer;
}
