package mh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r2 {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f74682a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f74683b;

    /* renamed from: c, reason: collision with root package name */
    public final q2 f74684c;

    /* renamed from: d, reason: collision with root package name */
    public final int f74685d;

    public r2(q2 q2Var) {
        this(q2Var, false, g0.none(), Integer.MAX_VALUE);
    }

    public static r2 fixedLength(int i10) {
        p1.checkArgument(i10 > 0, "The length may not be less than 1");
        return new r2(new com.google.android.exoplayer2.j0(i10, 6));
    }

    public static r2 on(char c10) {
        return on(g0.is(c10));
    }

    public static r2 onPattern(String str) {
        p1.checkNotNull(str);
        j0 j0VarCompile = o1.f74664a.compile(str);
        p1.checkArgument(!j0VarCompile.matcher("").matches(), "The pattern may not match the empty string: %s", j0VarCompile);
        return new r2(new ha.a(j0VarCompile, 19));
    }

    public r2 limit(int i10) {
        p1.checkArgument(i10 > 0, "must be greater than zero: %s", i10);
        return new r2(this.f74684c, this.f74683b, this.f74682a, i10);
    }

    public r2 omitEmptyStrings() {
        return new r2(this.f74684c, true, this.f74682a, this.f74685d);
    }

    public Iterable<String> split(CharSequence charSequence) {
        p1.checkNotNull(charSequence);
        return new n2(this, charSequence);
    }

    public List<String> splitToList(CharSequence charSequence) {
        p1.checkNotNull(charSequence);
        Iterator<String> it = this.f74684c.iterator(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Stream<String> splitToStream(CharSequence charSequence) {
        return StreamSupport.stream(split(charSequence).spliterator(), false);
    }

    public r2 trimResults() {
        return trimResults(g0.whitespace());
    }

    public o2 withKeyValueSeparator(String str) {
        return withKeyValueSeparator(on(str));
    }

    public r2(q2 q2Var, boolean z10, g0 g0Var, int i10) {
        this.f74684c = q2Var;
        this.f74683b = z10;
        this.f74682a = g0Var;
        this.f74685d = i10;
    }

    public static r2 on(g0 g0Var) {
        p1.checkNotNull(g0Var);
        return new r2(new ha.a(g0Var, 18));
    }

    public r2 trimResults(g0 g0Var) {
        p1.checkNotNull(g0Var);
        return new r2(this.f74684c, this.f74683b, g0Var, this.f74685d);
    }

    public o2 withKeyValueSeparator(char c10) {
        return withKeyValueSeparator(on(c10));
    }

    public o2 withKeyValueSeparator(r2 r2Var) {
        return new o2(this, r2Var);
    }

    public static r2 on(String str) {
        p1.checkArgument(str.length() != 0, "The separator may not be the empty string.");
        if (str.length() == 1) {
            return on(str.charAt(0));
        }
        return new r2(new c3.c(str, 10));
    }

    public static r2 on(Pattern pattern) {
        y0 y0Var = new y0(pattern);
        p1.checkArgument(!y0Var.matcher("").matches(), "The pattern may not match the empty string: %s", y0Var);
        return new r2(new ha.a(y0Var, 19));
    }
}
