package io.ktor.websocket;

import com.moloco.sdk.BKC.KerkSviMAy;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;
import qv.v;
import tu.f;
import uu.o1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class CloseReason {
    private final short code;
    private final String message;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum Codes {
        NORMAL(1000),
        GOING_AWAY(1001),
        PROTOCOL_ERROR(1002),
        CANNOT_ACCEPT(1003),
        CLOSED_ABNORMALLY(1006),
        NOT_CONSISTENT(1007),
        VIOLATED_POLICY(1008),
        TOO_BIG(1009),
        NO_EXTENSION(1010),
        INTERNAL_ERROR(1011),
        SERVICE_RESTART(1012),
        TRY_AGAIN_LATER(1013);

        public static final Companion Companion = new Companion(null);
        public static final Codes UNEXPECTED_CONDITION;
        private static final Map<Short, Codes> byCodeMap;
        private final short code;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public final Codes byCode(short s10) {
                return (Codes) Codes.byCodeMap.get(Short.valueOf(s10));
            }

            private Companion() {
            }

            @f
            public static /* synthetic */ void getUNEXPECTED_CONDITION$annotations() {
            }
        }

        static {
            Codes[] codesArrValues = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(v.coerceAtLeast(o1.mapCapacity(codesArrValues.length), 16));
            for (Codes codes : codesArrValues) {
                linkedHashMap.put(Short.valueOf(codes.code), codes);
            }
            byCodeMap = linkedHashMap;
            UNEXPECTED_CONDITION = INTERNAL_ERROR;
        }

        Codes(short s10) {
            this.code = s10;
        }

        public final short getCode() {
            return this.code;
        }
    }

    public CloseReason(short s10, String message) {
        e0.checkNotNullParameter(message, "message");
        this.code = s10;
        this.message = message;
    }

    public static /* synthetic */ CloseReason copy$default(CloseReason closeReason, short s10, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            s10 = closeReason.code;
        }
        if ((i10 & 2) != 0) {
            str = closeReason.message;
        }
        return closeReason.copy(s10, str);
    }

    public final short component1() {
        return this.code;
    }

    public final String component2() {
        return this.message;
    }

    public final CloseReason copy(short s10, String message) {
        e0.checkNotNullParameter(message, "message");
        return new CloseReason(s10, message);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloseReason)) {
            return false;
        }
        CloseReason closeReason = (CloseReason) obj;
        return this.code == closeReason.code && e0.areEqual(this.message, closeReason.message);
    }

    public final short getCode() {
        return this.code;
    }

    public final Codes getKnownReason() {
        return Codes.Companion.byCode(this.code);
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return this.message.hashCode() + (Short.hashCode(this.code) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("CloseReason(reason=");
        Object knownReason = getKnownReason();
        if (knownReason == null) {
            knownReason = Short.valueOf(this.code);
        }
        sb2.append(knownReason);
        sb2.append(", message=");
        return o2.q(sb2, this.message, ')');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CloseReason(Codes code, String str) {
        this(code.getCode(), str);
        e0.checkNotNullParameter(code, "code");
        e0.checkNotNullParameter(str, KerkSviMAy.atnHee);
    }
}
