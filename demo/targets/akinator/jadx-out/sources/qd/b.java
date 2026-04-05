package qd;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import md.y;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final b f82746e = new a().build();

    /* renamed from: a, reason: collision with root package name */
    public final m f82747a;

    /* renamed from: b, reason: collision with root package name */
    public final List f82748b;

    /* renamed from: c, reason: collision with root package name */
    public final d f82749c;

    /* renamed from: d, reason: collision with root package name */
    public final String f82750d;

    public b(m mVar, List list, d dVar, String str) {
        this.f82747a = mVar;
        this.f82748b = list;
        this.f82749c = dVar;
        this.f82750d = str;
    }

    public static b getDefaultInstance() {
        return f82746e;
    }

    public static a newBuilder() {
        return new a();
    }

    public String getAppNamespace() {
        return this.f82750d;
    }

    public d getGlobalMetrics() {
        d dVar = this.f82749c;
        return dVar == null ? d.getDefaultInstance() : dVar;
    }

    public d getGlobalMetricsInternal() {
        return this.f82749c;
    }

    public List<i> getLogSourceMetricsList() {
        return this.f82748b;
    }

    public m getWindow() {
        m mVar = this.f82747a;
        return mVar == null ? m.getDefaultInstance() : mVar;
    }

    public m getWindowInternal() {
        return this.f82747a;
    }

    public byte[] toByteArray() {
        return y.encode(this);
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        y.encode(this, outputStream);
    }
}
