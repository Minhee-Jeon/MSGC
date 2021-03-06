package com.kh.msg.chat.model.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.msg.chat.model.dao.DirectMsgDAO;
import com.kh.msg.chat.model.vo.DirectMsg;
import com.kh.msg.member.model.vo.Member;

@Service
public class DirectMsgServiceImpl implements DirectMsgService {

	@Autowired
	DirectMsgDAO directMsgDAO;

	@Override
	public List<DirectMsg> directMsgList(Map<String, Object> param) {
		return directMsgDAO.directMsgList(param);
	}

	@Override
	public List<DirectMsg> directMsgListByRecent(Map<String, Object> param) {
		return directMsgDAO.directMsgListByRecent(param);
	}

	@Override
	public int insert(Map<String, Object> param) {
		return directMsgDAO.insert(param);
	}

	@Override
	public DirectMsg selectOne(String toId) {
		return directMsgDAO.selectOne(toId);
	}


	@Override
	public List<Member> userLogin() {
		// TODO Auto-generated method stub
		return directMsgDAO.userLogin();
	}

	@Override
	public List<DirectMsg> headerDmList(Map<String, Object> param) {
		return directMsgDAO.headerDmList(param);
	}

	@Override
	public int readDm(Map<String, Object> param) {
		return directMsgDAO.readDm(param);
	}

	@Override
	public int getAllUnreadDm(String fromId) {
		return directMsgDAO.getAllUnreadDm(fromId);
	}

	@Override
	public int getUnreadDm(Map<String, Object> idMap) {
		return directMsgDAO.getUnreadDm(idMap);
	}



}
