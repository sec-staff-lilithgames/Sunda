package tn;

import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import gn.z0;
import io.bidmachine.media3.common.util.m0;
import io.bidmachine.media3.common.util.u0;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ko.a0;
import ko.c0;
import ko.e1;
import ko.v0;
import ko.x0;
import ko.z;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class w implements z {

    /* renamed from: i, reason: collision with root package name */
    public static final Pattern f87321i = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f87322j = Pattern.compile("MPEGTS:(-?\\d+)");

    /* renamed from: a, reason: collision with root package name */
    public final String f87323a;

    /* renamed from: b, reason: collision with root package name */
    public final u0 f87324b;

    /* renamed from: c, reason: collision with root package name */
    public final m0 f87325c;

    /* renamed from: d, reason: collision with root package name */
    public final hp.q f87326d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f87327e;

    /* renamed from: f, reason: collision with root package name */
    public c0 f87328f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f87329g;

    /* renamed from: h, reason: collision with root package name */
    public int f87330h;

    @Deprecated
    public w(String str, u0 u0Var) {
        this(str, u0Var, hp.q.f59124a, false);
    }

    public final e1 a(long j10) {
        e1 e1VarTrack = this.f87328f.track(0, 3);
        e1VarTrack.format(new gn.w().setSampleMimeType(MimeTypes.TEXT_VTT).setLanguage(this.f87323a).setSubsampleOffsetUs(j10).build());
        this.f87328f.endTracks();
        return e1VarTrack;
    }

    @Override // ko.z
    public /* bridge */ /* synthetic */ List getSniffFailureDetails() {
        return super.getSniffFailureDetails();
    }

    @Override // ko.z
    @SideEffectFree
    public /* bridge */ /* synthetic */ z getUnderlyingImplementation() {
        return super.getUnderlyingImplementation();
    }

    @Override // ko.z
    public void init(c0 c0Var) {
        if (this.f87327e) {
            c0Var = new hp.t(c0Var, this.f87326d);
        }
        this.f87328f = c0Var;
        c0Var.seekMap(new x0(C.TIME_UNSET));
    }

    @Override // ko.z
    public int read(a0 a0Var, v0 v0Var) throws IOException {
        io.bidmachine.media3.common.util.a.checkNotNull(this.f87328f);
        int length = (int) a0Var.getLength();
        int i10 = this.f87330h;
        byte[] bArr = this.f87329g;
        if (i10 == bArr.length) {
            this.f87329g = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f87329g;
        int i11 = this.f87330h;
        int i12 = a0Var.read(bArr2, i11, bArr2.length - i11);
        if (i12 != -1) {
            int i13 = this.f87330h + i12;
            this.f87330h = i13;
            if (length == -1 || i13 != length) {
                return 0;
            }
        }
        m0 m0Var = new m0(this.f87329g);
        qp.i.validateWebvttHeaderLine(m0Var);
        long jPtsToUs = 0;
        long timestampUs = 0;
        for (String line = m0Var.readLine(); !TextUtils.isEmpty(line); line = m0Var.readLine()) {
            if (line.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = f87321i.matcher(line);
                if (!matcher.find()) {
                    throw z0.createForMalformedContainer("X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(line), null);
                }
                Matcher matcher2 = f87322j.matcher(line);
                if (!matcher2.find()) {
                    throw z0.createForMalformedContainer("X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(line), null);
                }
                timestampUs = qp.i.parseTimestampUs((String) io.bidmachine.media3.common.util.a.checkNotNull(matcher.group(1)));
                jPtsToUs = u0.ptsToUs(Long.parseLong((String) io.bidmachine.media3.common.util.a.checkNotNull(matcher2.group(1))));
            }
        }
        Matcher matcherFindNextCueHeader = qp.i.findNextCueHeader(m0Var);
        if (matcherFindNextCueHeader == null) {
            a(0L);
        } else {
            long timestampUs2 = qp.i.parseTimestampUs((String) io.bidmachine.media3.common.util.a.checkNotNull(matcherFindNextCueHeader.group(1)));
            long jAdjustTsTimestamp = this.f87324b.adjustTsTimestamp(u0.usToWrappedPts((jPtsToUs + timestampUs2) - timestampUs));
            e1 e1VarA = a(jAdjustTsTimestamp - timestampUs2);
            byte[] bArr3 = this.f87329g;
            int i14 = this.f87330h;
            m0 m0Var2 = this.f87325c;
            m0Var2.reset(bArr3, i14);
            e1VarA.sampleData(m0Var2, this.f87330h);
            e1VarA.sampleMetadata(jAdjustTsTimestamp, 1, this.f87330h, 0, null);
        }
        return -1;
    }

    @Override // ko.z
    public void seek(long j10, long j11) {
        throw new IllegalStateException();
    }

    @Override // ko.z
    public boolean sniff(a0 a0Var) throws IOException {
        a0Var.peekFully(this.f87329g, 0, 6, false);
        byte[] bArr = this.f87329g;
        m0 m0Var = this.f87325c;
        m0Var.reset(bArr, 6);
        if (qp.i.isWebvttHeaderLine(m0Var)) {
            return true;
        }
        a0Var.peekFully(this.f87329g, 6, 3, false);
        m0Var.reset(this.f87329g, 9);
        return qp.i.isWebvttHeaderLine(m0Var);
    }

    public w(String str, u0 u0Var, hp.q qVar, boolean z10) {
        this.f87323a = str;
        this.f87324b = u0Var;
        this.f87325c = new m0();
        this.f87329g = new byte[1024];
        this.f87326d = qVar;
        this.f87327e = z10;
    }

    @Override // ko.z
    public void release() {
    }
}
