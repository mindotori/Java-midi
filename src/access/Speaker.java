package access;

public class Speaker {
    private int volume; //이러면 Speaker에서만 접근 가능
    // private 접근 제어자는 모든 외부 호출을 막는다
    // private이 붙은 경우에는 해당 클래스 내부에서만 호출할 수 있다.
    // int volume ====> private
    //생성자를 통해 초기음량 지정
    Speaker(int volume){
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    void  volumeDown(){
        volume -= 10;
        System.out.println("volumeDown 호출");
    }

    void showVolume() {
        System.out.println("현재 음량: "+volume);
    }
}
