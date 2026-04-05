package n4;

import androidx.datastore.preferences.protobuf.u1;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final a f75616a = new a(null);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public final i readFrom(InputStream input) throws IOException {
            e0.checkNotNullParameter(input, "input");
            try {
                i from = i.parseFrom(input);
                e0.checkNotNullExpressionValue(from, "{\n                Prefer…From(input)\n            }");
                return from;
            } catch (u1 e10) {
                throw new k4.e("Unable to parse preferences proto.", e10);
            }
        }
    }
}
