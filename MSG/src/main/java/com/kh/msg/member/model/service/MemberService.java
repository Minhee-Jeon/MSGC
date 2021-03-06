package com.kh.msg.member.model.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.kh.msg.board.model.vo.Board;
import com.kh.msg.member.model.vo.Department;
import com.kh.msg.member.model.vo.HrMntList;
import com.kh.msg.member.model.vo.IOLog;
import com.kh.msg.member.model.vo.Job;
import com.kh.msg.member.model.vo.Member;
import com.kh.msg.member.model.vo.OrgChart;
import com.kh.msg.member.model.vo.WorkTimes;


public interface MemberService {

	com.kh.msg.member.model.vo.OrgChart selectOne(String userId);

	List<HrMntList> selectList(HashMap<String, Object> map);

	List<OrgChart> orgChart(Map<String, Object> map);

	OrgChart empInfo(String empNo);

	int updateEmp(Map<String, String> map);

	void loginLog(int empNo);

	void logoutLog(int empNo);

	List<WorkTimes> getLog(HashMap<String, Object> map);

	List<IOLog> ioLog(Map<String, Object> map);

	List<Department> getDepts();

	List<Job> getJobs();

	int submitNewEmp(Member member);

	int countIOLog(Map<String, Object> map);

	int countEmpLog(HashMap<String, Object> map);

	List<HrMntList> selectEmpLog(HashMap<String, Object> map);

	int countOneEmpLog(HashMap<String, Object> map);

	int countOrgChart(Map<String, Object> map);
}