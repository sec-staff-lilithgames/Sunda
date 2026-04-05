package e4;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.TypedValue;
import android.view.ActionMode;
import android.widget.TextView;
import androidx.appcompat.app.j0;
import v3.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class t {
    /* JADX WARN: Multi-variable type inference failed */
    public static int getAutoSizeMaxTextSize(TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return j0.x(textView);
        }
        if (textView instanceof d) {
            return ((d) textView).getAutoSizeMaxTextSize();
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int getAutoSizeMinTextSize(TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return j0.y(textView);
        }
        if (textView instanceof d) {
            return ((d) textView).getAutoSizeMinTextSize();
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int getAutoSizeStepGranularity(TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return j0.z(textView);
        }
        if (textView instanceof d) {
            return ((d) textView).getAutoSizeStepGranularity();
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int[] getAutoSizeTextAvailableSizes(TextView textView) {
        return Build.VERSION.SDK_INT >= 27 ? j0.A(textView) : textView instanceof d ? ((d) textView).getAutoSizeTextAvailableSizes() : new int[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int getAutoSizeTextType(TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return j0.B(textView);
        }
        if (textView instanceof d) {
            return ((d) textView).getAutoSizeTextType();
        }
        return 0;
    }

    public static ColorStateList getCompoundDrawableTintList(TextView textView) {
        w3.i.checkNotNull(textView);
        return textView.getCompoundDrawableTintList();
    }

    public static PorterDuff.Mode getCompoundDrawableTintMode(TextView textView) {
        w3.i.checkNotNull(textView);
        return textView.getCompoundDrawableTintMode();
    }

    @Deprecated
    public static Drawable[] getCompoundDrawablesRelative(TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }

    public static int getFirstBaselineToTopHeight(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static int getLastBaselineToBottomHeight(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    @Deprecated
    public static int getMaxLines(TextView textView) {
        return textView.getMaxLines();
    }

    @Deprecated
    public static int getMinLines(TextView textView) {
        return textView.getMinLines();
    }

    public static v3.f getTextMetricsParams(TextView textView) {
        TextDirectionHeuristic textDirectionHeuristic;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return new v3.f(q.s(textView));
        }
        f.a aVar = new f.a(new TextPaint(textView.getPaint()));
        aVar.setBreakStrategy(textView.getBreakStrategy());
        aVar.setHyphenationFrequency(textView.getHyphenationFrequency());
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i10 < 28 || (textView.getInputType() & 15) != 3) {
                boolean z10 = textView.getLayoutDirection() == 1;
                switch (textView.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (!z10) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                            break;
                        } else {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                }
            } else {
                byte directionality = Character.getDirectionality(q.f(DecimalFormatSymbols.getInstance(textView.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        aVar.setTextDirection(textDirectionHeuristic);
        return aVar.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void setAutoSizeTextTypeUniformWithConfiguration(TextView textView, int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 27) {
            j0.p0(textView, i10, i11, i12, i13);
        } else if (textView instanceof d) {
            ((d) textView).setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void setAutoSizeTextTypeUniformWithPresetSizes(TextView textView, int[] iArr, int i10) throws IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 27) {
            j0.q0(textView, iArr, i10);
        } else if (textView instanceof d) {
            ((d) textView).setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void setAutoSizeTextTypeWithDefaults(TextView textView, int i10) {
        if (Build.VERSION.SDK_INT >= 27) {
            j0.r0(textView, i10);
        } else if (textView instanceof d) {
            ((d) textView).setAutoSizeTextTypeWithDefaults(i10);
        }
    }

    public static void setCompoundDrawableTintList(TextView textView, ColorStateList colorStateList) {
        w3.i.checkNotNull(textView);
        textView.setCompoundDrawableTintList(colorStateList);
    }

    public static void setCompoundDrawableTintMode(TextView textView, PorterDuff.Mode mode) {
        w3.i.checkNotNull(textView);
        textView.setCompoundDrawableTintMode(mode);
    }

    @Deprecated
    public static void setCompoundDrawablesRelative(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Deprecated
    public static void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Deprecated
    public static void setCustomSelectionActionModeCallback(TextView textView, ActionMode.Callback callback) {
        textView.setCustomSelectionActionModeCallback(wrapCustomSelectionActionModeCallback(textView, callback));
    }

    public static void setFirstBaselineToTopHeight(TextView textView, int i10) {
        w3.i.checkArgumentNonnegative(i10);
        if (Build.VERSION.SDK_INT >= 28) {
            q.z(textView, i10);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), i10 + i11, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void setLastBaselineToBottomHeight(TextView textView, int i10) {
        w3.i.checkArgumentNonnegative(i10);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i10 - i11);
        }
    }

    public static void setLineHeight(TextView textView, int i10) {
        w3.i.checkArgumentNonnegative(i10);
        if (i10 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i10 - r0, 1.0f);
        }
    }

    public static void setPrecomputedText(TextView textView, v3.i iVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setText(iVar.getPrecomputedText());
        } else {
            if (!getTextMetricsParams(textView).equalsWithoutTextDirection(iVar.getParams())) {
                throw new IllegalArgumentException("Given text can not be applied to TextView.");
            }
            textView.setText(iVar);
        }
    }

    public static void setTextAppearance(TextView textView, int i10) {
        textView.setTextAppearance(i10);
    }

    public static void setTextMetricsParams(TextView textView, v3.f fVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirection = fVar.getTextDirection();
        TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i10 = 1;
        if (textDirection != textDirectionHeuristic2 && textDirection != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirection == TextDirectionHeuristics.ANYRTL_LTR) {
                i10 = 2;
            } else if (textDirection == TextDirectionHeuristics.LTR) {
                i10 = 3;
            } else if (textDirection == TextDirectionHeuristics.RTL) {
                i10 = 4;
            } else if (textDirection == TextDirectionHeuristics.LOCALE) {
                i10 = 5;
            } else if (textDirection == textDirectionHeuristic) {
                i10 = 6;
            } else if (textDirection == textDirectionHeuristic2) {
                i10 = 7;
            }
        }
        textView.setTextDirection(i10);
        textView.getPaint().set(fVar.getTextPaint());
        textView.setBreakStrategy(fVar.getBreakStrategy());
        textView.setHyphenationFrequency(fVar.getHyphenationFrequency());
    }

    public static ActionMode.Callback unwrapCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        return (!(callback instanceof s) || Build.VERSION.SDK_INT < 26) ? callback : ((s) callback).f53738a;
    }

    public static ActionMode.Callback wrapCustomSelectionActionModeCallback(TextView textView, ActionMode.Callback callback) {
        int i10 = Build.VERSION.SDK_INT;
        return (i10 < 26 || i10 > 27 || (callback instanceof s) || callback == null) ? callback : new s(textView, callback);
    }

    @Deprecated
    public static void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textView, int i10, int i11, int i12, int i13) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
    }

    public static void setLineHeight(TextView textView, int i10, float f10) {
        if (Build.VERSION.SDK_INT >= 34) {
            r.setLineHeight(textView, i10, f10);
        } else {
            setLineHeight(textView, Math.round(TypedValue.applyDimension(i10, f10, textView.getResources().getDisplayMetrics())));
        }
    }
}
