package baseball.service;

import baseball.repository.PlayerRepository;

import java.util.ArrayList;
import camp.nextstep.edu.missionutils.Console;

public class PlayerService {
    private GameService gameService = new GameService();
    private PlayerRepository playerRepository;

    public void setPlayerNumber() {

    }

    public ArrayList<Integer> inputPlayerNumber() {
        ArrayList<Integer> playerNumberList = new ArrayList<>();
        String playerNumbers = Console.readLine();
        gameService.checkInputPlayerNumber(playerNumbers);
        for (int i=0;i<3;i++) {
            playerNumberList.add(Character.getNumericValue(playerNumbers.charAt(i)));
        }
        return playerNumberList;
    }





}