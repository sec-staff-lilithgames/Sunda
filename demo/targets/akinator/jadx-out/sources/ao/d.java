package ao;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import nh.b5;
import nh.p8;
import nh.x4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d implements z0 {

    /* renamed from: a, reason: collision with root package name */
    public final ko.e0 f7602a;

    /* renamed from: b, reason: collision with root package name */
    public ko.z f7603b;

    /* renamed from: c, reason: collision with root package name */
    public ko.s f7604c;

    public d(ko.e0 e0Var) {
        this.f7602a = e0Var;
    }

    @Override // ao.z0
    public void disableSeekingOnMp3Streams() {
        ko.z zVar = this.f7603b;
        if (zVar == null) {
            return;
        }
        ko.z underlyingImplementation = zVar.getUnderlyingImplementation();
        if (underlyingImplementation instanceof dp.d) {
            ((dp.d) underlyingImplementation).disableSeeking();
        }
    }

    @Override // ao.z0
    public long getCurrentInputPosition() {
        ko.s sVar = this.f7604c;
        if (sVar != null) {
            return sVar.getPosition();
        }
        return -1L;
    }

    @Override // ao.z0
    public void init(gn.o oVar, Uri uri, Map<String, List<String>> map, long j10, long j11, ko.c0 c0Var) throws IOException {
        ko.s sVar = new ko.s(oVar, j10, j11);
        this.f7604c = sVar;
        if (this.f7603b != null) {
            return;
        }
        ko.z[] zVarArrCreateExtractors = this.f7602a.createExtractors(uri, map);
        x4 x4VarBuilderWithExpectedSize = b5.builderWithExpectedSize(zVarArrCreateExtractors.length);
        if (zVarArrCreateExtractors.length == 1) {
            this.f7603b = zVarArrCreateExtractors[0];
        } else {
            int length = zVarArrCreateExtractors.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                ko.z zVar = zVarArrCreateExtractors[i10];
                try {
                } catch (EOFException unused) {
                    if (this.f7603b != null || sVar.getPosition() == j10) {
                    }
                } catch (Throwable th2) {
                    io.bidmachine.media3.common.util.a.checkState(this.f7603b != null || sVar.getPosition() == j10);
                    sVar.resetPeekPosition();
                    throw th2;
                }
                if (zVar.sniff(sVar)) {
                    this.f7603b = zVar;
                    io.bidmachine.media3.common.util.a.checkState(true);
                    sVar.resetPeekPosition();
                    break;
                } else {
                    x4VarBuilderWithExpectedSize.addAll((Iterable<Object>) zVar.getSniffFailureDetails());
                    boolean z10 = this.f7603b != null || sVar.getPosition() == j10;
                    io.bidmachine.media3.common.util.a.checkState(z10);
                    sVar.resetPeekPosition();
                    i10++;
                }
            }
            if (this.f7603b == null) {
                throw new c2("None of the available extractors (" + mh.d1.on(", ").join(p8.transform(b5.copyOf(zVarArrCreateExtractors), new c(0))) + ") could read the stream.", (Uri) io.bidmachine.media3.common.util.a.checkNotNull(uri), x4VarBuilderWithExpectedSize.build());
            }
        }
        this.f7603b.init(c0Var);
    }

    @Override // ao.z0
    public int read(ko.v0 v0Var) throws IOException {
        return ((ko.z) io.bidmachine.media3.common.util.a.checkNotNull(this.f7603b)).read((ko.a0) io.bidmachine.media3.common.util.a.checkNotNull(this.f7604c), v0Var);
    }

    @Override // ao.z0
    public void release() {
        ko.z zVar = this.f7603b;
        if (zVar != null) {
            zVar.release();
            this.f7603b = null;
        }
        this.f7604c = null;
    }

    @Override // ao.z0
    public void seek(long j10, long j11) {
        ((ko.z) io.bidmachine.media3.common.util.a.checkNotNull(this.f7603b)).seek(j10, j11);
    }
}
