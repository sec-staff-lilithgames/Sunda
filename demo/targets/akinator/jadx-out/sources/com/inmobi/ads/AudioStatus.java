package com.inmobi.ads;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class AudioStatus {
    private static final /* synthetic */ cv.a $ENTRIES;
    private static final /* synthetic */ AudioStatus[] $VALUES;
    public static final Companion Companion;
    public static final AudioStatus PLAYING = new AudioStatus("PLAYING", 0);
    public static final AudioStatus PAUSED = new AudioStatus("PAUSED", 1);
    public static final AudioStatus COMPLETED = new AudioStatus("COMPLETED", 2);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public /* bridge */ /* synthetic */ Object from(Object obj) {
            return from(((Number) obj).intValue());
        }

        private Companion() {
        }

        public AudioStatus from(int i10) {
            return i10 != 0 ? i10 != 1 ? AudioStatus.COMPLETED : AudioStatus.PAUSED : AudioStatus.PLAYING;
        }

        public Integer to(AudioStatus item) {
            e0.checkNotNullParameter(item, "item");
            return Integer.valueOf(item.ordinal());
        }
    }

    private static final /* synthetic */ AudioStatus[] $values() {
        return new AudioStatus[]{PLAYING, PAUSED, COMPLETED};
    }

    static {
        AudioStatus[] audioStatusArr$values = $values();
        $VALUES = audioStatusArr$values;
        $ENTRIES = cv.b.enumEntries(audioStatusArr$values);
        Companion = new Companion(null);
    }

    private AudioStatus(String str, int i10) {
    }

    public static AudioStatus from(int i10) {
        return Companion.from(i10);
    }

    public static cv.a getEntries() {
        return $ENTRIES;
    }

    public static int to(AudioStatus audioStatus) {
        return Companion.to(audioStatus).intValue();
    }

    public static AudioStatus valueOf(String str) {
        return (AudioStatus) Enum.valueOf(AudioStatus.class, str);
    }

    public static AudioStatus[] values() {
        return (AudioStatus[]) $VALUES.clone();
    }
}
