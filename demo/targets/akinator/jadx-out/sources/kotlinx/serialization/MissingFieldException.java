package kotlinx.serialization;

import java.util.List;
import kotlin.jvm.internal.e0;
import p0.o2;
import uu.o0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@ExperimentalSerializationApi
/* loaded from: classes10.dex */
public final class MissingFieldException extends SerializationException {
    private final List<String> missingFields;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(List<String> missingFields, String str, Throwable th2) {
        super(str, th2);
        e0.checkNotNullParameter(missingFields, "missingFields");
        this.missingFields = missingFields;
    }

    public final List<String> getMissingFields() {
        return this.missingFields;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MissingFieldException(List<String> missingFields, String serialName) {
        String strR;
        e0.checkNotNullParameter(missingFields, "missingFields");
        e0.checkNotNullParameter(serialName, "serialName");
        if (missingFields.size() == 1) {
            strR = o2.r(new StringBuilder("Field '"), missingFields.get(0), "' is required for type with serial name '", serialName, "', but it was missing");
        } else {
            strR = "Fields " + missingFields + " are required for type with serial name '" + serialName + "', but they were missing";
        }
        this(missingFields, strR, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(String missingField, String serialName) {
        this(o0.listOf(missingField), e3.g.l("Field '", missingField, "' is required for type with serial name '", serialName, "', but it was missing"), null);
        e0.checkNotNullParameter(missingField, "missingField");
        e0.checkNotNullParameter(serialName, "serialName");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(String missingField) {
        this(o0.listOf(missingField), a.b.l("Field '", missingField, "' is required, but it was missing"), null);
        e0.checkNotNullParameter(missingField, "missingField");
    }
}
