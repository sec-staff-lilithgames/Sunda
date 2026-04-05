package w6;

import android.content.ComponentName;
import android.content.Context;
import com.ironsource.Y1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final String f90434a = n6.c0.tagWithPrefix("PackageManagerHelper");

    public static boolean isComponentExplicitlyEnabled(Context context, Class<?> cls) {
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, cls.getName()));
        return componentEnabledSetting != 0 && componentEnabledSetting == 1;
    }

    public static void setComponentEnabled(Context context, Class<?> cls, boolean z10) {
        String str = Y1.f35725e;
        String str2 = f90434a;
        try {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, cls.getName()));
            boolean z11 = false;
            if (componentEnabledSetting != 0 && componentEnabledSetting == 1) {
                z11 = true;
            }
            if (z10 == z11) {
                n6.c0.get().debug(str2, "Skipping component enablement for ".concat(cls.getName()));
                return;
            }
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z10 ? 1 : 2, 1);
            n6.c0 c0Var = n6.c0.get();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append(" ");
            sb2.append(z10 ? "enabled" : Y1.f35725e);
            c0Var.debug(str2, sb2.toString());
        } catch (Exception e10) {
            n6.c0 c0Var2 = n6.c0.get();
            StringBuilder sb3 = new StringBuilder();
            a.b.z(cls, sb3, "could not be ");
            if (z10) {
                str = "enabled";
            }
            sb3.append(str);
            c0Var2.debug(str2, sb3.toString(), e10);
        }
    }

    public static boolean isComponentExplicitlyEnabled(Context context, String str) {
        return context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, str)) == 1;
    }
}
