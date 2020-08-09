package config;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import model1.DeptTO;

public interface SQLMapperInter {
	
	@Select("select deptno, dname, loc from dept where deptno=#{deptno}")
	public DeptTO selectByDeptno(String deptno);
	
	@Select("select deptno, dname, loc from dept")
	public List<DeptTO> selectList();
	
	// s로 시작하는 사원에 대한 정보를 출력하는 구문
	@Select("select * from emp where ename like #{ename}")
	public List<Map> selectContainName(String ename);
	
	@Insert("insert into dept2 values (#{deptno}, #{dname}, #{loc})")
	public int insert(DeptTO to);
	
	@Update("update dept2 set dname=#{dname} where deptno=#{deptno}")
	public int update(DeptTO to);
	
	@Delete("delete from dept2 where deptno=#{deptno}")
	public int delete(String deptno);
}
