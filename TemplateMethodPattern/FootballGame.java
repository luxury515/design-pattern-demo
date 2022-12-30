package TemplateMethodPattern;

public class FootballGame extends Game{

        @Override
        void initialize() {
            System.out.println("축구게임초기화 진행중...준비하세요!");
        }

        @Override
        void startPlay() {
            System.out.println("축구게임 시작!");
        }

        @Override
        void endPlay() {
            System.out.println("축구게임 종료!");
        }
}
