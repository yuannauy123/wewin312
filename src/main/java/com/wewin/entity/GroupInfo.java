package com.wewin.entity;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GroupInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column groupinfo.id
     *
     * @mbggenerated Tue Dec 19 22:06:29 CST 2017
     */
    private Integer groupId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column groupinfo.groupname
     *
     * @mbggenerated Tue Dec 19 22:06:29 CST 2017
     */
    private String groupName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column groupinfo.classid
     *
     * @mbggenerated Tue Dec 19 22:06:29 CST 2017
     */
    private Integer classId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column groupinfo.memsize
     *
     * @mbggenerated Tue Dec 19 22:06:29 CST 2017
     */
    private Integer memberSize;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column groupinfo.auth
     *
     * @mbggenerated Tue Dec 19 22:06:29 CST 2017
     */
    private Integer groupAuth;



    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column groupinfo.id
     *
     * @return the value of groupinfo.id
     *
     * @mbggenerated Tue Dec 19 22:06:29 CST 2017
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column groupinfo.id
     *
     * @param groupId the value for groupinfo.id
     *
     * @mbggenerated Tue Dec 19 22:06:29 CST 2017
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column groupinfo.groupname
     *
     * @return the value of groupinfo.groupname
     *
     * @mbggenerated Tue Dec 19 22:06:29 CST 2017
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column groupinfo.groupname
     *
     * @param groupName the value for groupinfo.groupname
     *
     * @mbggenerated Tue Dec 19 22:06:29 CST 2017
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column groupinfo.classid
     *
     * @return the value of groupinfo.classid
     *
     * @mbggenerated Tue Dec 19 22:06:29 CST 2017
     */
    public Integer getClassId() {
        return classId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column groupinfo.classid
     *
     * @param classId the value for groupinfo.classid
     *
     * @mbggenerated Tue Dec 19 22:06:29 CST 2017
     */
    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column groupinfo.memsize
     *
     * @return the value of groupinfo.memsize
     *
     * @mbggenerated Tue Dec 19 22:06:29 CST 2017
     */
    public Integer getMemberSize() {
        return memberSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column groupinfo.memsize
     *
     * @param memberSize the value for groupinfo.memsize
     *
     * @mbggenerated Tue Dec 19 22:06:29 CST 2017
     */
    public void setMemberSize(Integer memberSize) {
        this.memberSize = memberSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column groupinfo.auth
     *
     * @return the value of groupinfo.auth
     *
     * @mbggenerated Tue Dec 19 22:06:29 CST 2017
     */
    public Integer getGroupAuth() {
        return groupAuth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column groupinfo.auth
     *
     * @param groupAuth the value for groupinfo.auth
     *
     * @mbggenerated Tue Dec 19 22:06:29 CST 2017
     */
    public void setGroupAuth(Integer groupAuth) {
        this.groupAuth = groupAuth;
    }
}