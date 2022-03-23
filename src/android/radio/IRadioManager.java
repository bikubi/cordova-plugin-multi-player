package com.eltonfaust.multiplayer;

import org.json.JSONObject;

public interface IRadioManager {
    void setStreamURL(String streamURL);
    void setAutoKillNotification(boolean killNotification);
    void startRadio();
    void startRadio(int streamType);
    void stopRadio();
    void pauseRadio();

    boolean isPlaying();

    JSONObject getProgress();
    long getDuration();
    long seekTo(long position);

    void setListener(RadioListener mRadioListener);
    void registerListener(RadioListener mRadioListener);
    void unregisterListener(RadioListener mRadioListener);

    void connect();
    void disconnect();
}
