package com.mbridge.msdk.nativex.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.NativeListener;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class MBNativeRollView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private RollingBCView f42040a;

    /* renamed from: b, reason: collision with root package name */
    private Context f42041b;

    /* renamed from: c, reason: collision with root package name */
    private NativeListener.FilpListener f42042c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
    }

    public MBNativeRollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f42040a.dispatchTouchEvent(motionEvent);
    }

    public void setData(List<Frame> list, Context context, String str, a aVar) throws Resources.NotFoundException {
        this.f42040a.setData(list, context, str, aVar);
    }

    public void setFilpListening(NativeListener.FilpListener filpListener) {
        if (filpListener != null) {
            this.f42042c = filpListener;
            this.f42040a.setFilpListening(filpListener);
        }
    }

    public void setFrameWidth(int i10) {
        this.f42040a.setLayoutParams(new LinearLayout.LayoutParams(i10, -2));
    }

    public MBNativeRollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42041b = context;
        RollingBCView rollingBCView = new RollingBCView(context);
        this.f42040a = rollingBCView;
        addView(rollingBCView);
        this.f42040a.setLayoutParams(new LinearLayout.LayoutParams((int) (u0.j(context) * 0.9d), -2));
        setClipChildren(false);
    }

    public MBNativeRollView(Context context) {
        this(context, null);
    }
}
