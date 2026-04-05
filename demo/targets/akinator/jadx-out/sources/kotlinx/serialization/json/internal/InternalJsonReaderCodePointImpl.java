package kotlinx.serialization.json.internal;

import com.applovin.shadow.okio.Utf8;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@JsonFriendModuleApi
/* loaded from: classes10.dex */
public abstract class InternalJsonReaderCodePointImpl implements InternalJsonReader {
    private Character bufferedChar;

    public abstract boolean exhausted();

    public abstract int nextCodePoint();

    @Override // kotlinx.serialization.json.internal.InternalJsonReader
    public final int read(char[] buffer, int i10, int i11) {
        int i12;
        e0.checkNotNullParameter(buffer, "buffer");
        Character ch2 = this.bufferedChar;
        if (ch2 != null) {
            e0.checkNotNull(ch2);
            buffer[i10] = ch2.charValue();
            this.bufferedChar = null;
            i12 = 1;
        } else {
            i12 = 0;
        }
        while (i12 < i11 && !exhausted()) {
            int iNextCodePoint = nextCodePoint();
            if (iNextCodePoint <= 65535) {
                buffer[i10 + i12] = (char) iNextCodePoint;
                i12++;
            } else {
                char c10 = (char) ((iNextCodePoint >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                char c11 = (char) ((iNextCodePoint & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) + Utf8.LOG_SURROGATE_HEADER);
                buffer[i10 + i12] = c10;
                int i13 = i12 + 1;
                if (i13 < i11) {
                    buffer[i13 + i10] = c11;
                    i12 += 2;
                } else {
                    this.bufferedChar = Character.valueOf(c11);
                    i12 = i13;
                }
            }
        }
        if (i12 > 0) {
            return i12;
        }
        return -1;
    }
}
