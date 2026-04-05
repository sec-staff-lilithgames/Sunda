package kotlinx.serialization;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Target({})
@ExperimentalSerializationApi
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes10.dex */
public @interface EncodeDefault {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @ExperimentalSerializationApi
    public static final class Mode {
        private static final /* synthetic */ cv.a $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Mode ALWAYS = new Mode("ALWAYS", 0);
        public static final Mode NEVER = new Mode("NEVER", 1);

        private static final /* synthetic */ Mode[] $values() {
            return new Mode[]{ALWAYS, NEVER};
        }

        static {
            Mode[] modeArr$values = $values();
            $VALUES = modeArr$values;
            $ENTRIES = cv.b.enumEntries(modeArr$values);
        }

        private Mode(String str, int i10) {
        }

        public static cv.a getEntries() {
            return $ENTRIES;
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    Mode mode() default Mode.ALWAYS;
}
