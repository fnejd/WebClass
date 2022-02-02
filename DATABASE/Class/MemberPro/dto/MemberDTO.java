package dto;

public class MemberDTO {
	
	//DB설계할 때 변수명이랑 똑같이 하는 것이 좋다.
	//필드명이랑 변수명이랑 똑같이 해준다.
	
	//외부 클래스에서 변수에 접근할 수 없게 만든다 (캡슐화) 접근제한자 -> private
	
	private int num;
	private String username;
	private String tel;
	private String email;
	private String birth;
	private String gender;
	private String writedate;
	

	public MemberDTO() {}
	
	//setter
	public void setNum(int num) {
		this.num = num;
	}
	//getter
	public int getNum() {
		return num;
	}
	//setter
	public void setUsername(String username) {
		this.username = username;
	}
	//getter
	public String getUsername() {
		return username;
	}
	//mouse -> source -> generate getter and setter

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getWritedate() {
		return writedate;
	}

	public void setWritedate(String writedate) {
		this.writedate = writedate;
	}
	
	
	

}
