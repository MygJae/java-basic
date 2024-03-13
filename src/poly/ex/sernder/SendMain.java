package poly.ex.sernder;

public class SendMain {

    public static void main(String[] args) {
        /**
         * 다중 메시지 발송
         *   Sender 인터페이스
         *   EmailSender, SmsSender, FaceBookSender 구현
         */

        Sender[] senders = {new EmailSender(), new SmsSender(), new FaceBookSender()};

        for (Sender sender : senders) {
            sender.sendMessage("환영합니다!");
        }
    }


}

