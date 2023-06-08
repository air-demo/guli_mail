package com.air.common.utils.valid;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.HashSet;
import java.util.Set;

/**
 * @author air
 * @create 2023-05-28-20:39
 */
public class ListValueConstraintValidator implements ConstraintValidator<ListValue,Integer> {


    private Set<Integer> set=new HashSet<>();

    @Override
    public void initialize(ListValue constraintAnnotation) {
        int[] vals=constraintAnnotation.vals();
        for(int val:vals){
            set.add(val);
        }
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext constraintValidatorContext) {


        return set.contains(value);
    }
}
