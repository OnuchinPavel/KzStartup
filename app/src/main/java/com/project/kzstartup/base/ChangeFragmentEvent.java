package com.project.kzstartup.base;

/**
 * Created by onuchin on 31.12.2016.
 */

public class ChangeFragmentEvent {
    private  BaseFragment baseFragment;
    public  ChangeFragmentEvent(BaseFragment baseFragment){this.baseFragment =baseFragment;}
    public  BaseFragment getBaseFragment(){return  baseFragment;}
}
