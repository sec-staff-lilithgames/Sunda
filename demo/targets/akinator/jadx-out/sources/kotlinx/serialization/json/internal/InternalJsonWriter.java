package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.e0;
import kv.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@JsonFriendModuleApi
/* loaded from: classes10.dex */
public interface InternalJsonWriter {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final void doWriteEscaping(String text, q writeImpl) {
            e0.checkNotNullParameter(text, "text");
            e0.checkNotNullParameter(writeImpl, "writeImpl");
            int length = text.length();
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                char cCharAt = text.charAt(i11);
                if (cCharAt < StringOpsKt.getESCAPE_STRINGS().length && StringOpsKt.getESCAPE_STRINGS()[cCharAt] != null) {
                    writeImpl.invoke(text, Integer.valueOf(i10), Integer.valueOf(i11));
                    String str = StringOpsKt.getESCAPE_STRINGS()[cCharAt];
                    e0.checkNotNull(str);
                    writeImpl.invoke(str, 0, Integer.valueOf(str.length()));
                    i10 = i11 + 1;
                }
            }
            writeImpl.invoke(text, Integer.valueOf(i10), Integer.valueOf(text.length()));
        }
    }

    void release();

    void write(String str);

    void writeChar(char c10);

    void writeLong(long j10);

    void writeQuoted(String str);
}
