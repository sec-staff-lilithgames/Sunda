package vw;

import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class l1 implements o1 {

    /* renamed from: b, reason: collision with root package name */
    public final LinkedList f89961b = new LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public final yw.t0 f89962c;

    public l1(yw.j jVar) {
        this.f89962c = jVar.getStyle();
    }

    @Override // vw.o1
    public String getAttribute(String str) {
        return ((yw.l) this.f89962c).getAttribute(str);
    }

    @Override // vw.o1
    public String getElement(String str) {
        return ((yw.l) this.f89962c).getElement(str);
    }

    @Override // vw.o1
    public String getFirst() {
        return null;
    }

    @Override // vw.o1
    public int getIndex() {
        return 0;
    }

    @Override // vw.o1
    public String getLast() {
        return null;
    }

    @Override // vw.o1
    public String getPath() {
        return "";
    }

    @Override // vw.o1
    public String getPrefix() {
        return null;
    }

    @Override // vw.o1
    public boolean isAttribute() {
        return false;
    }

    @Override // vw.o1
    public boolean isEmpty() {
        return true;
    }

    @Override // vw.o1
    public boolean isPath() {
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator<String> iterator() {
        return this.f89961b.iterator();
    }

    @Override // vw.o1
    public o1 getPath(int i10) {
        return null;
    }

    @Override // vw.o1
    public o1 getPath(int i10, int i11) {
        return null;
    }
}
