package com.example.nordshop.presenters;

public class GamePresenter implements GameContract.GamePresenter {

    private GameContract.GameView view;

    public GamePresenter(GameContract.GameView view){ setView(view); }
    @Override
    public void searchGame() { /*view.favoriteGame(gamesList);*/ }

    @Override
    public void warning(String warning) { view.changeText(warning); }

    @Override
    public void setView(GameContract.GameView view) { this.view = view; }

    @Override
    public void destroy() { this.view = null; }
}
