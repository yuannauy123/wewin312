package com.wewin.mapper;

import com.wewin.entity.*;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groupinfo
     *
     * @mbggenerated Tue Dec 19 22:06:29 CST 2017
     */
    int countByExample(GroupInfoExample example);

    /**
     * 查找小组以及小组中的成员
     *
     * @param classId
     * @return
     */
    List<GroupMembers> selectGroupAndMembers(Integer classId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groupinfo
     *
     * @mbggenerated Tue Dec 19 22:06:29 CST 2017
     */
    int deleteByExample(GroupInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groupinfo
     *
     * @mbggenerated Tue Dec 19 22:06:29 CST 2017
     */
    int deleteByPrimaryKey(Integer groupId);

    /**
     * 删除单个分组
     * @param
     * @return
     */
    int  deleteGroup(Integer groupid);


    /**
     * 删除小组单个成员
     * @param
     * @return
     */
    int deletemember(GroupMemberLink link);

    /**
     * 删除小组全部成员
     * @param
     * @return
     */
    int deletemembers(Integer groupid);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groupinfo
     *
     * @mbggenerated Tue Dec 19 22:06:29 CST 2017
     */
    int insert(GroupInfo record);

    /**小组增加多个新成员

     */
    int insertmenbers(List<GroupMemberLink> list);

    /**小组增加一个新成员
     * */
    int insertmenber(GroupMemberLink link);

    /**
     *查找小组全部成员
     * */
    List<UserInfo> selectGroupMembers(Integer groupid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groupinfo
     *
     * @mbggenerated Tue Dec 19 22:06:29 CST 2017
     */
    int insertSelective(GroupInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groupinfo
     *
     * @mbggenerated Tue Dec 19 22:06:29 CST 2017
     */
    List<GroupInfo> selectByExample(GroupInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groupinfo
     *
     * @mbggenerated Tue Dec 19 22:06:29 CST 2017
     */
    GroupInfo selectByPrimaryKey(Integer groupId);

    /**
     * 通过班级id找该班级所有分组
     * @param classId
     * @return
     */
    List<GroupInfo> selectByClassId(Integer classId);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groupinfo
     *
     * @mbggenerated Tue Dec 19 22:06:29 CST 2017
     */


    /**查找班级的 所有成员 组的id
     * @param
     * @return
     * */
    List<GroupInfo> selectallmembergroup(@Param("classid") Integer classid);


    int updateByExampleSelective(@Param("record") GroupInfo record, @Param("example") GroupInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groupinfo
     *
     * @mbggenerated Tue Dec 19 22:06:29 CST 2017
     */
    int updateByExample(@Param("record") GroupInfo record, @Param("example") GroupInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groupinfo
     *
     * @mbggenerated Tue Dec 19 22:06:29 CST 2017
     */
    int updateByPrimaryKeySelective(GroupInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groupinfo
     *
     * @mbggenerated Tue Dec 19 22:06:29 CST 2017
     */
    int updateByPrimaryKey(GroupInfo record);
}