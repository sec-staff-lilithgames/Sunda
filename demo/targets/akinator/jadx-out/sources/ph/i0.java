package ph;

import com.amazon.aps.shared.util.APSSharedUtil;
import java.io.IOException;
import java.io.Reader;
import java.util.stream.Stream;
import mh.k1;
import mh.p1;
import mh.r2;
import nh.b5;
import nh.p2;
import nh.yh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class i0 extends m0 {

    /* renamed from: b, reason: collision with root package name */
    public static final r2 f81313b = r2.onPattern("\r\n|\n|\r");

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f81314a;

    public i0(CharSequence charSequence) {
        this.f81314a = (CharSequence) p1.checkNotNull(charSequence);
    }

    @Override // ph.m0
    public boolean isEmpty() {
        return this.f81314a.length() == 0;
    }

    @Override // ph.m0
    public long length() {
        return this.f81314a.length();
    }

    @Override // ph.m0
    public k1 lengthIfKnown() {
        return k1.of(Long.valueOf(this.f81314a.length()));
    }

    @Override // ph.m0
    public Stream<String> lines() {
        return yh.stream(new p2(this));
    }

    @Override // ph.m0
    public Reader openStream() {
        return new f0(this.f81314a);
    }

    @Override // ph.m0
    public String read() {
        return this.f81314a.toString();
    }

    @Override // ph.m0
    public String readFirstLine() {
        p2 p2Var = new p2(this);
        if (p2Var.hasNext()) {
            return (String) p2Var.next();
        }
        return null;
    }

    @Override // ph.m0
    public <T> T readLines(t0 t0Var) throws IOException {
        p2 p2Var = new p2(this);
        while (p2Var.hasNext()) {
            if (!t0Var.a()) {
                break;
            }
        }
        return (T) t0Var.getResult();
    }

    public String toString() {
        return "CharSource.wrap(" + mh.c.truncate(this.f81314a, 30, APSSharedUtil.TRUNCATE_SEPARATOR) + ")";
    }

    @Override // ph.m0
    public b5 readLines() {
        return b5.copyOf(new p2(this));
    }
}
