package o9;

import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import rw.hIT.uQjDr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class z0 extends androidx.fragment.app.z1 {

    /* renamed from: m, reason: collision with root package name */
    public final SparseArray f78706m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ a1 f78707n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(a1 a1Var, FragmentManager fragmentManager) {
        super(fragmentManager, 1);
        this.f78707n = a1Var;
        this.f78706m = new SparseArray();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f78707n.f78022h.size();
    }

    @Override // androidx.fragment.app.z1
    public Fragment getItem(int i10) {
        c1 c1VarNewInstance;
        a1 a1Var = this.f78707n;
        String str = (String) a1Var.f78022h.get(i10);
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -982907812:
                if (str.equals(uQjDr.xQzhSReAz)) {
                    c10 = 0;
                    break;
                }
                break;
            case -284959541:
                if (str.equals("classement")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3199:
                if (str.equals("dc")) {
                    c10 = 2;
                    break;
                }
                break;
            case 107450:
                if (str.equals("lsa")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1239881226:
                if (str.equals("morefun")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1564195625:
                if (str.equals("character")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                c1VarNewInstance = j.newInstance();
                break;
            case 1:
                c1VarNewInstance = s.f78491t.newInstance();
                break;
            case 2:
                c1VarNewInstance = v0.newInstance();
                break;
            case 3:
                c1VarNewInstance = m1.newInstance();
                break;
            case 4:
                c1VarNewInstance = n3.newInstance();
                break;
            case 5:
                c1VarNewInstance = s3.newInstance(a1Var.f78024j);
                break;
            default:
                c1VarNewInstance = null;
                break;
        }
        if (c1VarNewInstance != null) {
            this.f78706m.put(i10, c1VarNewInstance);
            c1VarNewInstance.setOnDeactivateAutoScrollListener(new w0(a1Var));
        }
        return c1VarNewInstance;
    }
}
