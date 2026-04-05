package g3;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.helper.widget.ADoa.QFzuMMDfrzagDN;
import com.amazon.aps.shared.APSAnalytics;
import com.ironsource.C3191e4;
import com.ironsource.Y1;
import com.moloco.sdk.internal.configs.Gzp.wHkgq;
import j1.o2;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.CharBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class b {
    public static void dumpLayoutParams(ViewGroup viewGroup, String str) throws IllegalAccessException, SecurityException, IllegalArgumentException {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str2 = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + str + "  ";
        int childCount = viewGroup.getChildCount();
        System.out.println(str + " children " + childCount);
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            PrintStream printStream = System.out;
            StringBuilder sbT = a.b.t(str2, "     ");
            sbT.append(getName(childAt));
            printStream.println(sbT.toString());
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            for (Field field : layoutParams.getClass().getFields()) {
                try {
                    Object obj = field.get(layoutParams);
                    if (field.getName().contains("To") && !obj.toString().equals(Y1.f35726f)) {
                        System.out.println(str2 + "       " + field.getName() + " " + obj);
                    }
                } catch (IllegalAccessException unused) {
                }
            }
        }
    }

    public static void dumpPoc(Object obj) throws IllegalAccessException, SecurityException, IllegalArgumentException {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
        Class<?> cls = obj.getClass();
        PrintStream printStream = System.out;
        StringBuilder sbT = a.b.t(str, "------------- ");
        sbT.append(cls.getName());
        sbT.append(" --------------------");
        printStream.println(sbT.toString());
        for (Field field : cls.getFields()) {
            try {
                Object obj2 = field.get(obj);
                if (field.getName().startsWith("layout_constraint") && ((!(obj2 instanceof Integer) || !obj2.toString().equals(Y1.f35726f)) && ((!(obj2 instanceof Integer) || !obj2.toString().equals("0")) && ((!(obj2 instanceof Float) || !obj2.toString().equals(APSAnalytics.DEFAULT_SDK_VERSION)) && (!(obj2 instanceof Float) || !obj2.toString().equals("0.5")))))) {
                    System.out.println(str + "    " + field.getName() + " " + obj2);
                }
            } catch (IllegalAccessException unused) {
            }
        }
        PrintStream printStream2 = System.out;
        StringBuilder sbT2 = a.b.t(str, "------------- ");
        sbT2.append(cls.getSimpleName());
        sbT2.append(" --------------------");
        printStream2.println(sbT2.toString());
    }

    public static String getActionType(MotionEvent motionEvent) throws SecurityException {
        int action = motionEvent.getAction();
        for (Field field : MotionEvent.class.getFields()) {
            if (Modifier.isStatic(field.getModifiers()) && field.getType().equals(Integer.TYPE) && field.getInt(null) == action) {
                return field.getName();
            }
        }
        return "---";
    }

    public static String getCallFrom(int i10) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[i10 + 2];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
    }

    public static String getLocation() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
    }

    public static String getLocation2() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[2];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
    }

    public static String getName(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    public static String getState(i0 i0Var, int i10) {
        return getState(i0Var, i10, -1);
    }

    public static void logStack(String str, String str2, int i10) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int iMin = Math.min(i10, stackTrace.length - 1);
        String strL = " ";
        for (int i11 = 1; i11 <= iMin; i11++) {
            StackTraceElement stackTraceElement = stackTrace[i11];
            String str3 = ".(" + stackTrace[i11].getFileName() + ":" + stackTrace[i11].getLineNumber() + ") " + stackTrace[i11].getMethodName();
            strL = o2.l(strL, " ");
            Log.v(str, str2 + strL + str3 + strL);
        }
    }

    public static void printStack(String str, int i10) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int iMin = Math.min(i10, stackTrace.length - 1);
        String strL = " ";
        for (int i11 = 1; i11 <= iMin; i11++) {
            StackTraceElement stackTraceElement = stackTrace[i11];
            String str2 = ".(" + stackTrace[i11].getFileName() + ":" + stackTrace[i11].getLineNumber() + ") ";
            strL = o2.l(strL, " ");
            System.out.println(str + strL + str2 + strL);
        }
    }

    public static String getLoc() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + QFzuMMDfrzagDN.dPLvTPjnCWKlCHP + stackTraceElement.getMethodName() + "()";
    }

    public static String getState(i0 i0Var, int i10, int i11) throws Resources.NotFoundException {
        int length;
        if (i10 == -1) {
            return "UNDEFINED";
        }
        String resourceEntryName = i0Var.getContext().getResources().getResourceEntryName(i10);
        if (i11 == -1) {
            return resourceEntryName;
        }
        if (resourceEntryName.length() > i11) {
            resourceEntryName = resourceEntryName.replaceAll("([^_])[aeiou]+", "$1");
        }
        if (resourceEntryName.length() <= i11 || (length = resourceEntryName.replaceAll("[^_]", "").length()) <= 0) {
            return resourceEntryName;
        }
        return resourceEntryName.replaceAll(CharBuffer.allocate((resourceEntryName.length() - i11) / length).toString().replace((char) 0, '.') + "_", "_");
    }

    public static String getName(Context context, int i10) {
        if (i10 != -1) {
            try {
                return context.getResources().getResourceEntryName(i10);
            } catch (Exception unused) {
                return a.b.e(i10, "?");
            }
        }
        return "UNKNOWN";
    }

    public static String getName(Context context, int[] iArr) throws Resources.NotFoundException {
        String resourceEntryName;
        try {
            String str = iArr.length + C3191e4.i.f36529d;
            int i10 = 0;
            while (i10 < iArr.length) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(i10 == 0 ? "" : " ");
                String string = sb2.toString();
                try {
                    resourceEntryName = context.getResources().getResourceEntryName(iArr[i10]);
                } catch (Resources.NotFoundException unused) {
                    resourceEntryName = "? " + iArr[i10] + " ";
                }
                str = string + resourceEntryName;
                i10++;
            }
            return str + C3191e4.i.f36531e;
        } catch (Exception e10) {
            Log.v("DEBUG", e10.toString());
            return "UNKNOWN";
        }
    }

    public static void dumpLayoutParams(ViewGroup.LayoutParams layoutParams, String str) throws IllegalAccessException, SecurityException, IllegalArgumentException {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str2 = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + wHkgq.SRpgNDOeO + str + "  ";
        PrintStream printStream = System.out;
        StringBuilder sbO = e3.g.o(" >>>>>>>>>>>>>>>>>>. dump ", str2, "  ");
        sbO.append(layoutParams.getClass().getName());
        printStream.println(sbO.toString());
        for (Field field : layoutParams.getClass().getFields()) {
            try {
                Object obj = field.get(layoutParams);
                String name = field.getName();
                if (name.contains("To") && !obj.toString().equals(Y1.f35726f)) {
                    System.out.println(str2 + "       " + name + " " + obj);
                }
            } catch (IllegalAccessException unused) {
            }
        }
        System.out.println(" <<<<<<<<<<<<<<<<< dump " + str2);
    }
}
