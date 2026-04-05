package d8;

import androidx.datastore.preferences.protobuf.h0;
import com.google.android.play.core.splitinstall.internal.d0;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import pw.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class c implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f51935g = new String[128];

    /* renamed from: b, reason: collision with root package name */
    public int f51936b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f51937c;

    /* renamed from: e, reason: collision with root package name */
    public String[] f51938e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f51939f;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f51935g[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f51935g;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public static c of(k kVar) {
        return new d(kVar);
    }

    public final void a(int i10) {
        int i11 = this.f51936b;
        int[] iArr = this.f51937c;
        if (i11 == iArr.length) {
            if (i11 == 256) {
                throw new d0("Nesting too deep at " + getPath());
            }
            this.f51937c = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f51938e;
            this.f51938e = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f51939f;
            this.f51939f = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f51937c;
        int i12 = this.f51936b;
        this.f51936b = i12 + 1;
        iArr3[i12] = i10;
    }

    public final void b(String str) throws h0 {
        StringBuilder sbT = a.b.t(str, " at path ");
        sbT.append(getPath());
        throw new h0(sbT.toString());
    }

    public abstract void beginArray() throws IOException;

    public abstract void beginObject() throws IOException;

    public abstract void endArray() throws IOException;

    public abstract void endObject() throws IOException;

    public final String getPath() {
        int i10 = this.f51936b;
        int[] iArr = this.f51937c;
        String[] strArr = this.f51938e;
        int[] iArr2 = this.f51939f;
        StringBuilder sb2 = new StringBuilder("$");
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (i12 == 1 || i12 == 2) {
                sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
                sb2.append(iArr2[i11]);
                sb2.append(AbstractJsonLexerKt.END_LIST);
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                sb2.append('.');
                String str = strArr[i11];
                if (str != null) {
                    sb2.append(str);
                }
            }
        }
        return sb2.toString();
    }

    public abstract boolean hasNext() throws IOException;

    public abstract boolean nextBoolean() throws IOException;

    public abstract double nextDouble() throws IOException;

    public abstract int nextInt() throws IOException;

    public abstract String nextName() throws IOException;

    public abstract String nextString() throws IOException;

    public abstract b peek() throws IOException;

    public abstract int selectName(a aVar) throws IOException;

    public abstract void skipName() throws IOException;

    public abstract void skipValue() throws IOException;
}
