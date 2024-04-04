package com.design.patterns.factory.practicalfactory.audioplayer;

public class AudioPlayerFactory {
    public static AudioPlayer getAudioPlayer(MediaFormat format, int volume, double playBackRate) {
        if (format == MediaFormat.MP3) {
            return new MP3Player(volume, playBackRate);
        } else if (format == MediaFormat.FLAC) {
            return new FLACPlayer(volume, playBackRate);
        } else if (format == MediaFormat.WAV) {
            return new WAVPlayer(volume, playBackRate);
        }
        throw new IllegalArgumentException("Invalid media format");
    }
}
