package androidx.recyclerview.widget;

import android.R;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.zip.CRC32;
import xr.d5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class l1 {

    /* renamed from: a, reason: collision with root package name */
    public Object f7184a;

    public /* synthetic */ l1(Object obj) {
        this.f7184a = obj;
    }

    public static void a(l1 l1Var, int i10) {
        int i11;
        d5 d5Var = (d5) l1Var.f7184a;
        int i12 = d5Var.f92411h;
        CRC32 crc32 = d5Var.f92407c;
        int i13 = i12 - d5Var.f92410g;
        if (i13 > 0) {
            int iMin = Math.min(i13, i10);
            crc32.update(d5Var.f92409f, d5Var.f92410g, iMin);
            d5Var.f92410g += iMin;
            i11 = i10 - iMin;
        } else {
            i11 = i10;
        }
        if (i11 > 0) {
            byte[] bArr = new byte[512];
            int i14 = 0;
            while (i14 < i11) {
                int iMin2 = Math.min(i11 - i14, 512);
                d5Var.f92406b.readBytes(bArr, 0, iMin2);
                crc32.update(bArr, 0, iMin2);
                i14 += iMin2;
            }
        }
        d5Var.f92418o += i10;
    }

    public void b() {
        View view = (View) this.f7184a;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public int c() {
        int unsignedByte;
        d5 d5Var = (d5) this.f7184a;
        int i10 = d5Var.f92411h;
        int i11 = d5Var.f92410g;
        if (i10 - i11 > 0) {
            unsignedByte = d5Var.f92409f[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            d5Var.f92410g = i11 + 1;
        } else {
            unsignedByte = d5Var.f92406b.readUnsignedByte();
        }
        d5Var.f92407c.update(unsignedByte);
        d5Var.f92418o++;
        return unsignedByte;
    }

    public int d() {
        return c() | (c() << 8);
    }

    public int e() {
        d5 d5Var = (d5) this.f7184a;
        return d5Var.f92406b.readableBytes() + (d5Var.f92411h - d5Var.f92410g);
    }

    public void f() {
        View viewFindViewById;
        View view = (View) this.f7184a;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new com.google.android.material.datepicker.d(viewFindViewById, 1));
    }

    public l1(int i10) {
        switch (i10) {
            case 3:
                this.f7184a = new HashMap();
                break;
            case 9:
                this.f7184a = new LinkedHashMap();
                break;
            case 10:
                this.f7184a = new AtomicLong();
                break;
            default:
                this.f7184a = j9.s.createQueue(0);
                break;
        }
    }
}
