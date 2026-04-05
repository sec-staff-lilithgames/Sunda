package ji;

import com.amazon.aps.shared.util.APSSharedUtil;
import com.google.android.gms.ads.nonagon.util.logging.csi.iPgB.gjnZrsdA;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class q implements e {

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f69610c = Charset.forName(C.UTF8_NAME);

    /* renamed from: a, reason: collision with root package name */
    public final File f69611a;

    /* renamed from: b, reason: collision with root package name */
    public o f69612b;

    public q(File file) {
        this.f69611a = file;
    }

    public final void a() {
        File file = this.f69611a;
        if (this.f69612b == null) {
            try {
                this.f69612b = new o(file);
            } catch (IOException e10) {
                ei.f.getLogger().e("Could not open log file: " + file, e10);
            }
        }
    }

    @Override // ji.e
    public void closeLogFile() throws IOException {
        hi.j.closeOrLog(this.f69612b, "There was a problem closing the Crashlytics log file.");
        this.f69612b = null;
    }

    @Override // ji.e
    public void deleteLogFile() throws IOException {
        closeLogFile();
        this.f69611a.delete();
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    @Override // ji.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] getLogAsBytes() {
        /*
            r7 = this;
            java.io.File r0 = r7.f69611a
            boolean r0 = r0.exists()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto Lc
        La:
            r4 = r2
            goto L3a
        Lc:
            r7.a()
            ji.o r0 = r7.f69612b
            if (r0 != 0) goto L14
            goto La
        L14:
            int[] r3 = new int[]{r1}
            int r0 = r0.usedBytes()
            byte[] r0 = new byte[r0]
            ji.o r4 = r7.f69612b     // Catch: java.io.IOException -> L29
            ji.p r5 = new ji.p     // Catch: java.io.IOException -> L29
            r5.<init>(r0, r3)     // Catch: java.io.IOException -> L29
            r4.forEach(r5)     // Catch: java.io.IOException -> L29
            goto L33
        L29:
            r4 = move-exception
            ei.f r5 = ei.f.getLogger()
            java.lang.String r6 = "A problem occurred while reading the Crashlytics log file."
            r5.e(r6, r4)
        L33:
            com.android.billingclient.api.w r4 = new com.android.billingclient.api.w
            r3 = r3[r1]
            r4.<init>(r0, r3)
        L3a:
            if (r4 != 0) goto L3d
            return r2
        L3d:
            int r0 = r4.f12790a
            byte[] r2 = new byte[r0]
            java.lang.Object r3 = r4.f12791b
            byte[] r3 = (byte[]) r3
            java.lang.System.arraycopy(r3, r1, r2, r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ji.q.getLogAsBytes():byte[]");
    }

    @Override // ji.e
    public String getLogAsString() {
        byte[] logAsBytes = getLogAsBytes();
        if (logAsBytes != null) {
            return new String(logAsBytes, f69610c);
        }
        return null;
    }

    @Override // ji.e
    public void writeToLog(long j10, String str) {
        a();
        if (this.f69612b != null) {
            if (str == null) {
                str = AbstractJsonLexerKt.NULL;
            }
            try {
                if (str.length() > 16384) {
                    str = APSSharedUtil.TRUNCATE_SEPARATOR + str.substring(str.length() - 16384);
                }
                this.f69612b.add(String.format(Locale.US, "%d %s%n", Long.valueOf(j10), str.replaceAll(gjnZrsdA.wsunoRUUgE, " ").replaceAll("\n", " ")).getBytes(f69610c));
                while (!this.f69612b.isEmpty() && this.f69612b.usedBytes() > 65536) {
                    this.f69612b.remove();
                }
            } catch (IOException e10) {
                ei.f.getLogger().e("There was a problem writing to the Crashlytics log.", e10);
            }
        }
    }
}
