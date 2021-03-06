package com.kh.msg.res.model.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.msg.member.model.vo.Member;
import com.kh.msg.res.model.vo.Car;
import com.kh.msg.res.model.vo.CarReservation;
import com.kh.msg.res.model.vo.ConfReservation;
import com.kh.msg.res.model.vo.ConferenceRoom;
import com.kh.msg.res.model.vo.ResView;
import com.kh.msg.res.model.vo.Reservation;

@Repository
public class ResDAOImpl implements ResDAO {
	
	@Autowired
	SqlSessionTemplate sqlSession;

	@Override
	public List<ConferenceRoom> selectConfList() {
		return sqlSession.selectList("res.selectConfList");
	}
	
	@Override
	public int confResInsert(ConfReservation cr) {
		return sqlSession.insert("res.confResInsert", cr);
	}

	@Override
	public List<Car> selectCarList() {
		return sqlSession.selectList("res.selectCarList");
	}

	@Override
	public int carResInsert(CarReservation cr) {
		return sqlSession.insert("res.carResInsert", cr);
	}
	
	@Override
	public List<ResView> selectAllConfResList(String empNo, String srchFrom, String srchTo) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("empNo", empNo);
		map.put("srchFrom", srchFrom);
		map.put("srchTo", srchTo);
		return sqlSession.selectList("res.selectAllConfResList", map);
	}

	@Override
	public List<ResView> selectAllCarResList(String empNo, String srchFrom, String srchTo) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("empNo", empNo);
		map.put("srchFrom", srchFrom);
		map.put("srchTo", srchTo);
		return sqlSession.selectList("res.selectAllCarResList", map);
	}

	@Override
	public List<ResView> selectAllRList(String empNo, String srchFrom, String srchTo) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("empNo", empNo);
		map.put("srchFrom", srchFrom);
		map.put("srchTo", srchTo);
		return sqlSession.selectList("res.selectAllRList", map);
	}

	@Override
	public int addConferenceRoom(ConferenceRoom c) {
		return sqlSession.insert("res.addConferenceRoom", c);
	}

	@Override
	public int addCar(Car c) {
		return sqlSession.insert("res.addCar", c);
	}

	@Override
	public int getNextval(String seq) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("seq", seq);
		return sqlSession.selectOne("res.getNextval", map);
	}

	@Override
	public int delCar(String carCode) {
		return sqlSession.delete("res.delCar", carCode);
	}

	@Override
	public List<Car> selectCarListEnd(String resUseDate, String resReturnDate) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("resUseDate", resUseDate);
		map.put("resReturnDate", resReturnDate);
		return sqlSession.selectList("res.selectCarListEnd", map);
	}
	@Override
	public int delRes(String resCate, String resCode) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("resCate", resCate);
		map.put("resCode", resCode);
		return sqlSession.delete("res.delRes", map);
	}

	@Override
	public int confToSchedInsert(ConfReservation cr) {
		return sqlSession.insert("res.confToSchedInsert", cr);
	}

	@Override
	public int carToSchedInsert(CarReservation cr) {
		return sqlSession.insert("res.carToSchedInsert", cr);
	}

	@Override
	public int delResToSched(String resCate, String resCode) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("resCate", resCate);
		map.put("resCode", resCode);
		return sqlSession.delete("res.delResToSched", map);
	}


}
