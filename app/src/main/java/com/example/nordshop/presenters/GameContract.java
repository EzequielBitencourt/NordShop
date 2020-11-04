package com.example.nordshop.presenters;

import com.example.nordshop.model.Game;

import java.util.List;

public interface GameContract {

    interface GameView{
        void changeText(String text);
        void favoriteGame(List<Game> gamesList);
    }

    interface GamePresenter{
        void searchGame();
        void warning(String warning);
        void setView(GameContract.GameView view);
        void destroy();
    }


}
