package u4;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i extends j {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f87844a;

    /* renamed from: b, reason: collision with root package name */
    public final f f87845b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f87846c = true;

    public i(TextView textView) {
        this.f87844a = textView;
        this.f87845b = new f(textView);
    }

    @Override // u4.j
    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        if (!this.f87846c) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                InputFilter inputFilter = inputFilterArr[i10];
                if (inputFilter instanceof f) {
                    sparseArray.put(i10, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                if (sparseArray.indexOfKey(i12) < 0) {
                    inputFilterArr2[i11] = inputFilterArr[i12];
                    i11++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i13 = 0;
        while (true) {
            f fVar = this.f87845b;
            if (i13 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = fVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i13] == fVar) {
                return inputFilterArr;
            }
            i13++;
        }
    }

    @Override // u4.j
    public final void b(boolean z10) {
        if (z10) {
            d();
        }
    }

    @Override // u4.j
    public final void c(boolean z10) {
        this.f87846c = z10;
        d();
        TextView textView = this.f87844a;
        textView.setFilters(a(textView.getFilters()));
    }

    @Override // u4.j
    public final void d() {
        TextView textView = this.f87844a;
        textView.setTransformationMethod(e(textView.getTransformationMethod()));
    }

    @Override // u4.j
    public final TransformationMethod e(TransformationMethod transformationMethod) {
        return this.f87846c ? ((transformationMethod instanceof o) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new o(transformationMethod) : transformationMethod instanceof o ? ((o) transformationMethod).getOriginalTransformationMethod() : transformationMethod;
    }

    @Override // u4.j
    public boolean isEnabled() {
        return this.f87846c;
    }
}
