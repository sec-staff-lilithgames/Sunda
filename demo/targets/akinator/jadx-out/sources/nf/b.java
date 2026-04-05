package nf;

import ef.j;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final b f76070c = new b();

    /* renamed from: b, reason: collision with root package name */
    public final List f76071b;

    public b(ef.b bVar) {
        this.f76071b = Collections.singletonList(bVar);
    }

    @Override // ef.j
    public List<ef.b> getCues(long j10) {
        return j10 >= 0 ? this.f76071b : Collections.EMPTY_LIST;
    }

    @Override // ef.j
    public long getEventTime(int i10) {
        com.google.android.exoplayer2.util.a.checkArgument(i10 == 0);
        return 0L;
    }

    @Override // ef.j
    public int getEventTimeCount() {
        return 1;
    }

    @Override // ef.j
    public int getNextEventTimeIndex(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    public b() {
        this.f76071b = Collections.EMPTY_LIST;
    }
}
