package com.example.empl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Employee {
    private Long id;
    private String name;
    private String phone;
    private String email;

    /*
     * 
     * -------No need to write this getters and setters instead of that import
     * lombok.data
     * public String getName() {
     * return name;
     * }
     * 
     * public void setName(String name) {
     * this.name = name;
     * }
     */

}
