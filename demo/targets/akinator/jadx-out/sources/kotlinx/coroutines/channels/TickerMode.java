package kotlinx.coroutines.channels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class TickerMode {
    private static final /* synthetic */ cv.a $ENTRIES;
    private static final /* synthetic */ TickerMode[] $VALUES;
    public static final TickerMode FIXED_PERIOD = new TickerMode("FIXED_PERIOD", 0);
    public static final TickerMode FIXED_DELAY = new TickerMode("FIXED_DELAY", 1);

    private static final /* synthetic */ TickerMode[] $values() {
        return new TickerMode[]{FIXED_PERIOD, FIXED_DELAY};
    }

    static {
        TickerMode[] tickerModeArr$values = $values();
        $VALUES = tickerModeArr$values;
        $ENTRIES = cv.b.enumEntries(tickerModeArr$values);
    }

    private TickerMode(String str, int i10) {
    }

    public static cv.a getEntries() {
        return $ENTRIES;
    }

    public static TickerMode valueOf(String str) {
        return (TickerMode) Enum.valueOf(TickerMode.class, str);
    }

    public static TickerMode[] values() {
        return (TickerMode[]) $VALUES.clone();
    }
}
