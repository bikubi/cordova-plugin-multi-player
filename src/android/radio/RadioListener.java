package com.eltonfaust.multiplayer;

public interface RadioListener {
    void onRadioLoading();
    void onRadioConnected();
    void onRadioDisconnected();
    void onRadioStarted();
    void onRadioStopped();
    void onRadioPaused();
    void onRadioStoppedFocusLoss();
    void onRadioMetadata(String metadata);
    void onError();
}
