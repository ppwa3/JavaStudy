package skillup.project04;

import java.util.Scanner;


public class FriendInfoHandler {
	
	/*
	멤버변수 : 상속관계에 있어 최상위 클래스인 Friend로 배열을
		생성한다. 클래스가 상속관계에 있다면 상위클래스 배열에
		하위클래스의 인스턴스를 저장할 수 있다. */
	private Friend[] myFriends;
	//정보 카운트용 변수 생성
	private int numOfFriends;
	
	//생성자
	public FriendInfoHandler(int num) {
		/*
		핸들러 클래스의 인스턴스를 생성할때 데이터 저장을 위한 Friend
		타입의 배열의 인스턴스도 함께 생성한다.
		 */
		myFriends = new Friend[num];
		//카운트용 변수는 0으로 초기화
		numOfFriends = 0;
	}
	
	//연락처 정보 추가를 위한 메서드
	public void addFriend(int choice) {
		//Scanner scan = new Scanner(System.in);
		//공통정보 3가지를 먼저 입력받는다.
		String iName,iPhone,iAddr,iNickname,iMajor;
		System.out.print("이름:");iName = MyFriendInfoBook.scan.nextLine();
		System.out.print("전화번호:");iPhone = MyFriendInfoBook.scan.nextLine();
		System.out.print("주소:");iAddr = MyFriendInfoBook.scan.nextLine();
		
		/*
		1,2번을 구분해서 각 인스턴스를 생성한 후 저장은 부모 타입인
		Friend 배열에 저장한다. 즉 상속을 통해 타입이 다른 자식
		인스턴스를 통합적으로 관리할 수 있다. */
		if(choice==1) {
			System.out.print("별명:"); iNickname = MyFriendInfoBook.scan.nextLine();
			HighFriend high = new HighFriend(iName, iPhone,
					iAddr, iNickname);
			myFriends[numOfFriends++] = high;
		}
		else if(choice==2) {
			System.out.print("전공:"); iMajor = MyFriendInfoBook.scan.nextLine();
			myFriends[numOfFriends++] =
					new UnivFriend(iName, iPhone, iAddr, iMajor);
		}
		/*
		High, Univ타입의 인스턴스를 Friend타입의 배열에 추가할때에는
		자동형변환이 일어난다. 정수를 실수타입의 변수에 저장할대
		자동형변환이 되는것과 동일한 현상이라 생각하면된다.
		즉 High, Univ 인스턴스는 Friend 타입의 인스턴스로 자동
		형변환되어 저장된다. */
		System.out.println("##친구정보 입력이 완료되었습니다##");
	}
	
	//전체 정보 출력
	public void showAllDate() {
		//System.out.println("showAllDate 호출됨");
		//배열에 저장된 정보의 갯수만큼 반복
		for(int i=0 ; i<numOfFriends ; i++) {
			myFriends[i].showAllData();
			}
		System.out.println("##전체정보가 출력되었습니다##");
	}
	//간략 정보 출력
	public void showSimpleDate() {
		//System.out.println("showSimpleDate 호출됨");
		/*
		저장된 인스턴스의 갯수만큼 반복해서 각 인스턴스가 원래 어떤
		타입이었는지 확인한 후 원래의 타입으로 형변환한다. */
		for (int i=0 ; i<numOfFriends ; i++) {
			myFriends[i].showAllData();
		}
			
	
		System.out.println("##간략정보가 출력되었습니다##"); 
	}
	
	//이름으로 정보 검색
	public void searchInfo() {
		//System.out.println("searchInfo 호출됨");
		//검색 결과 출력용 변수
		boolean isFind = false;
		//Scanner scan = new Scanner(System.in);
		System.out.print("검색할 이름을 입력하세요:");
		String searchName = MyFriendInfoBook.scan.nextLine();
		
		//고딩친구반복
		for(int i=0 ; i<numOfFriends ; i++) {
			/*
			문자열 비교를 위한 메서드 중 compareTo()를 사용해서
			검색 기능 구현. "문자열1.compareTo(문자열2)" 형식으로ㅛ
			사용하고 일치하는 경우 0을 반환한다. */
			if(searchName.compareTo(myFriends[i].name)==0) 
				myFriends[i].showAllData();
			}
			//검색할 이름과 일치한다면 전체 정보를 출력
			System.out.println("##귀하가 요청하는 정보를 찾았습니다.##");{
			//정보를 찾았으므로 true로 변경
			isFind = true;
	}		
		if(isFind==false)
			System.out.println("##찾는 정보가 없습니다.##");
	}
	public void deleteInfo() {
		
		//Scanner scanner = new Scanner(System.in);
		System.out.print("삭제할 이름을 입력하세요:");
		String deleteName = MyFriendInfoBook.scan.nextLine();
		int deleteIndex = -1;
		
		for(int i=0 ; i<numOfFriends ; i++) {
			//검색할 이름과 일치하는지 확인
			if(deleteName.compareTo(myFriends[i].name)==0) {
				/*
				일치하는 정보를 찾았다면 자식클래스로 형변환 후
				메서드를 호출하여 출력한다. */
				myFriends[i] = null;
				deleteIndex = i;
				numOfFriends--;
				break;
				//정보를 찾았다면 true로 변경
			}
		}
		
		//만약 검색결과가 없다면 아래와 같이 출력한다.
		if(deleteIndex==-1) {
			System.out.println("##삭제된 데이터가 없습니다.##");
		}
		else {
			for(int i=deleteIndex ; i<numOfFriends ; i++) {
				myFriends[i] = myFriends[i+1];
			}
			System.out.println("##데이터("+ deleteIndex
					+"번)가 삭제되었습니다##");
		}
	}
}