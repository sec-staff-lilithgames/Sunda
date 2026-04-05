package io.odeeo.internal.t0;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m extends g implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f66430a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends f {

        /* renamed from: a, reason: collision with root package name */
        public final Matcher f66431a;

        public a(Matcher matcher) {
            this.f66431a = (Matcher) u.checkNotNull(matcher);
        }

        @Override // io.odeeo.internal.t0.f
        public int end() {
            return this.f66431a.end();
        }

        @Override // io.odeeo.internal.t0.f
        public boolean find() {
            return this.f66431a.find();
        }

        @Override // io.odeeo.internal.t0.f
        public boolean matches() {
            return this.f66431a.matches();
        }

        @Override // io.odeeo.internal.t0.f
        public String replaceAll(String str) {
            return this.f66431a.replaceAll(str);
        }

        @Override // io.odeeo.internal.t0.f
        public int start() {
            return this.f66431a.start();
        }

        @Override // io.odeeo.internal.t0.f
        public boolean find(int i10) {
            return this.f66431a.find(i10);
        }
    }

    public m(Pattern pattern) {
        this.f66430a = (Pattern) u.checkNotNull(pattern);
    }

    @Override // io.odeeo.internal.t0.g
    public int flags() {
        return this.f66430a.flags();
    }

    @Override // io.odeeo.internal.t0.g
    public f matcher(CharSequence charSequence) {
        return new a(this.f66430a.matcher(charSequence));
    }

    @Override // io.odeeo.internal.t0.g
    public String pattern() {
        return this.f66430a.pattern();
    }

    @Override // io.odeeo.internal.t0.g
    public String toString() {
        return this.f66430a.toString();
    }
}
