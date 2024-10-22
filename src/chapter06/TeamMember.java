package chapter06;

public class TeamMember {
	
	//멤버변수
	public String teamName;//팀명
	public String mName;//팀장
	public String mPhone;//팀장 전화번호
	public String sName;//부팅장
	public String name;//팀원
	public String gender;//성별
	
	//기본 생성자
	public TeamMember() {
		
	}
	
	//생성자 오버로딩
	public TeamMember(String name, String gender) {
		this.name=name;
		this.gender=gender;
	}
	
	//getters and setters
	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmPhone() {
		return mPhone;
	}

	public void setmPhone(String mPhone) {
		this.mPhone = mPhone;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	

}
