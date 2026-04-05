package b9;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import com.apm.insight.b.El.rJqlArycrfkilN;
import com.bumptech.glide.u;
import com.vungle.ads.internal.protos.Sdk;
import j9.q;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import n8.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class d extends Drawable implements i, Animatable, f6.d {

    /* renamed from: b, reason: collision with root package name */
    public final c f8934b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8935c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8936e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8937f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8938g;

    /* renamed from: h, reason: collision with root package name */
    public int f8939h;

    /* renamed from: i, reason: collision with root package name */
    public int f8940i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8941j;

    /* renamed from: k, reason: collision with root package name */
    public Paint f8942k;

    /* renamed from: l, reason: collision with root package name */
    public Rect f8943l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f8944m;

    @Deprecated
    public d(Context context, m8.b bVar, q8.d dVar, z zVar, int i10, int i11, Bitmap bitmap) {
        this(context, bVar, zVar, i10, i11, bitmap);
    }

    @Override // f6.d
    public void clearAnimationCallbacks() {
        ArrayList arrayList = this.f8944m;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f8937f) {
            return;
        }
        if (this.f8941j) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f8943l == null) {
                this.f8943l = new Rect();
            }
            Gravity.apply(Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, intrinsicWidth, intrinsicHeight, bounds, this.f8943l);
            this.f8941j = false;
        }
        k kVar = this.f8934b.f8933a;
        h hVar = kVar.f8960j;
        Bitmap bitmap = hVar != null ? hVar.f8949i : kVar.f8963m;
        if (this.f8943l == null) {
            this.f8943l = new Rect();
        }
        Rect rect = this.f8943l;
        if (this.f8942k == null) {
            this.f8942k = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.f8942k);
    }

    public ByteBuffer getBuffer() {
        return this.f8934b.f8933a.f8951a.getData().asReadOnlyBuffer();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f8934b;
    }

    public Bitmap getFirstFrame() {
        return this.f8934b.f8933a.f8963m;
    }

    public int getFrameCount() {
        return this.f8934b.f8933a.f8951a.getFrameCount();
    }

    public int getFrameIndex() {
        h hVar = this.f8934b.f8933a.f8960j;
        if (hVar != null) {
            return hVar.f8947g;
        }
        return -1;
    }

    public z getFrameTransformation() {
        return this.f8934b.f8933a.f8964n;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f8934b.f8933a.f8968r;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f8934b.f8933a.f8967q;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public int getSize() {
        k kVar = this.f8934b.f8933a;
        return kVar.f8951a.getByteSize() + kVar.f8966p;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f8935c;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f8941j = true;
    }

    @Override // b9.i
    public void onFrameReady() {
        Object callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (getFrameIndex() == getFrameCount() - 1) {
            this.f8939h++;
        }
        int i10 = this.f8940i;
        if (i10 == -1 || this.f8939h < i10) {
            return;
        }
        ArrayList arrayList = this.f8944m;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((f6.c) this.f8944m.get(i11)).onAnimationEnd(this);
            }
        }
        stop();
    }

    public void recycle() {
        this.f8937f = true;
        k kVar = this.f8934b.f8933a;
        u uVar = kVar.f8954d;
        kVar.f8953c.clear();
        Bitmap bitmap = kVar.f8963m;
        if (bitmap != null) {
            kVar.f8955e.put(bitmap);
            kVar.f8963m = null;
        }
        kVar.f8956f = false;
        h hVar = kVar.f8960j;
        if (hVar != null) {
            uVar.clear(hVar);
            kVar.f8960j = null;
        }
        h hVar2 = kVar.f8962l;
        if (hVar2 != null) {
            uVar.clear(hVar2);
            kVar.f8962l = null;
        }
        h hVar3 = kVar.f8965o;
        if (hVar3 != null) {
            uVar.clear(hVar3);
            kVar.f8965o = null;
        }
        kVar.f8951a.clear();
        kVar.f8961k = true;
    }

    @Override // f6.d
    public void registerAnimationCallback(f6.c cVar) {
        if (cVar == null) {
            return;
        }
        if (this.f8944m == null) {
            this.f8944m = new ArrayList();
        }
        this.f8944m.add(cVar);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f8942k == null) {
            this.f8942k = new Paint(2);
        }
        this.f8942k.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f8942k == null) {
            this.f8942k = new Paint(2);
        }
        this.f8942k.setColorFilter(colorFilter);
    }

    public void setFrameTransformation(z zVar, Bitmap bitmap) {
        this.f8934b.f8933a.c(zVar, bitmap);
    }

    public void setLoopCount(int i10) {
        if (i10 <= 0 && i10 != -1 && i10 != 0) {
            throw new IllegalArgumentException("Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC");
        }
        if (i10 != 0) {
            this.f8940i = i10;
        } else {
            int totalIterationCount = this.f8934b.f8933a.f8951a.getTotalIterationCount();
            this.f8940i = totalIterationCount != 0 ? totalIterationCount : -1;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        q.checkArgument(!this.f8937f, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f8938g = z10;
        if (!z10) {
            this.f8935c = false;
            k kVar = this.f8934b.f8933a;
            ArrayList arrayList = kVar.f8953c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                kVar.f8956f = false;
            }
        } else if (this.f8936e) {
            a();
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f8936e = true;
        this.f8939h = 0;
        if (this.f8938g) {
            a();
        }
    }

    public void startFromFirstFrame() {
        q.checkArgument(!this.f8935c, "You cannot restart a currently running animation.");
        k kVar = this.f8934b.f8933a;
        q.checkArgument(!kVar.f8956f, "Can't restart a running animation");
        kVar.f8958h = true;
        h hVar = kVar.f8965o;
        if (hVar != null) {
            kVar.f8954d.clear(hVar);
            kVar.f8965o = null;
        }
        start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f8936e = false;
        this.f8935c = false;
        k kVar = this.f8934b.f8933a;
        ArrayList arrayList = kVar.f8953c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            kVar.f8956f = false;
        }
    }

    @Override // f6.d
    public boolean unregisterAnimationCallback(f6.c cVar) {
        ArrayList arrayList = this.f8944m;
        if (arrayList == null || cVar == null) {
            return false;
        }
        return arrayList.remove(cVar);
    }

    public d(Context context, m8.b bVar, z zVar, int i10, int i11, Bitmap bitmap) {
        this(new c(new k(com.bumptech.glide.c.get(context), bVar, i10, i11, zVar, bitmap)));
    }

    public final void a() {
        q.checkArgument(!this.f8937f, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        c cVar = this.f8934b;
        if (cVar.f8933a.f8951a.getFrameCount() == 1) {
            invalidateSelf();
            return;
        }
        if (this.f8935c) {
            return;
        }
        this.f8935c = true;
        k kVar = cVar.f8933a;
        ArrayList arrayList = kVar.f8953c;
        if (kVar.f8961k) {
            throw new IllegalStateException(rJqlArycrfkilN.CSVEeGrtWnZUphU);
        }
        if (arrayList.contains(this)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (zIsEmpty && !kVar.f8956f) {
            kVar.f8956f = true;
            kVar.f8961k = false;
            kVar.a();
        }
        invalidateSelf();
    }

    public d(c cVar) {
        this.f8938g = true;
        this.f8940i = -1;
        this.f8934b = (c) q.checkNotNull(cVar);
    }
}
