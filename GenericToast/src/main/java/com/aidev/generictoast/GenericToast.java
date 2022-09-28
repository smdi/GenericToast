package com.aidev.generictoast;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.res.ResourcesCompat;
import com.google.android.material.card.MaterialCardView;


public class GenericToast {

    public static final String SUCCESS = "SUCCESS";
    public static final String ERROR = "ERROR";
    public static final String WARNING = "WARNING";
    public static final String INFO = "INFO";
    public static final String CUSTOM = "CUSTOM";
    public static final String LITE = "LITE";
    public static final String DARK = "DARK";
    public static final int DEFAULT_FONT = 0;
    public static final int LENGTH_SHORT = 0;
    public static final int LENGTH_LONG = 1;

    public static void showToast(Activity activity, String titleData, String messageData,
                                 int duration, String type, String mode, int titleFont, int messageFont) {

        View view = LayoutInflater.from(activity)
                .inflate(R.layout.generic_toast_layout, null);

        MaterialCardView materialCardView = view.findViewById(R.id.genericToastCard);
        ImageView genericToastImageType = view.findViewById(R.id.genericToastTypeImage);

        TextView title = view.findViewById(R.id.genericToastTitle);
        TextView message = view.findViewById(R.id.genericToastMessage);


        setFontByCheckingDefault(activity, titleFont, messageFont, title, message);

        title.setText(titleData);
        message.setText(messageData);

        setColorByType(activity, type, mode, materialCardView, title, message, genericToastImageType);

        Toast toast = new Toast(activity);
        toast.setDuration(duration);
        toast.setView(view);
        toast.show();
        startAnimationToastTypeImage(view, activity, genericToastImageType);
    }

    public static void showToast(Context context, String titleData, String messageData,
                                 int duration, String type, String mode, int titleFont, int messageFont) {

        View view = LayoutInflater.from(context)
                .inflate(R.layout.generic_toast_layout, null);

        MaterialCardView materialCardView = view.findViewById(R.id.genericToastCard);
        ImageView genericToastImageType = view.findViewById(R.id.genericToastTypeImage);

        TextView title = view.findViewById(R.id.genericToastTitle);
        TextView message = view.findViewById(R.id.genericToastMessage);


        setFontByCheckingDefault(context, titleFont, messageFont, title, message);

        title.setText(titleData);
        message.setText(messageData);

        setColorByType(context, type, mode, materialCardView, title, message, genericToastImageType);

        Toast toast = new Toast(context);
        toast.setDuration(duration);
        toast.setView(view);
        toast.show();
        startAnimationToastTypeImage(view, context, genericToastImageType);
    }

    private static void startAnimationToastTypeImage(View view, Context context, ImageView genericToastImageType) {

        final Animation myAnim = AnimationUtils.loadAnimation(context, R.anim.gt_bounce_animation);
        BounceActionAnimation interpolator = new BounceActionAnimation(0.2, 25);
        myAnim.setInterpolator(interpolator);
        genericToastImageType.startAnimation(myAnim);
    }

    private static void startAnimationToastTypeImage(View view, Activity activity, ImageView genericToastImageType) {

        final Animation myAnim = AnimationUtils.loadAnimation(activity, R.anim.gt_bounce_animation);
        BounceActionAnimation interpolator = new BounceActionAnimation(0.2, 25);
        myAnim.setInterpolator(interpolator);
        genericToastImageType.startAnimation(myAnim);
    }


    private static void setFontByCheckingDefault(Context context, int titleFont, int messageFont, TextView title, TextView message) {
        if(titleFont != DEFAULT_FONT) setFontForTitle(context, titleFont, title);
        if(messageFont != DEFAULT_FONT) setFontForMessage(context, messageFont, message);
    }

    private static void setFontByCheckingDefault(Activity activity, int titleFont, int messageFont, TextView title, TextView message) {
        if(titleFont != DEFAULT_FONT) setFontForTitle(activity, titleFont, title);
        if(messageFont != DEFAULT_FONT) setFontForMessage(activity, messageFont, message);
    }

    private static void setFontForMessage(Context context, int messageFont, TextView message) {
        Typeface fontMessage = ResourcesCompat.getFont(context, messageFont);
        message.setTypeface(fontMessage);
    }

    private static void setFontForMessage(Activity activity, int messageFont, TextView message) {
        Typeface fontMessage = ResourcesCompat.getFont(activity, messageFont);
        message.setTypeface(fontMessage);
    }

    private static void setFontForTitle(Context context, int titleFont, TextView title) {
        Typeface fontTitle = ResourcesCompat.getFont(context, titleFont);
        title.setTypeface(fontTitle);
    }

    private static void setFontForTitle(Activity activity, int titleFont, TextView title) {
        Typeface fontTitle = ResourcesCompat.getFont(activity, titleFont);
        title.setTypeface(fontTitle);
    }

    private static void setColorToCard(MaterialCardView materialCardView, Context context, int colorBackground, TextView title, int titleColor, ImageView genericToastImageType, int imageBackroundType){
        title.setTextColor(context.getResources().getColor(titleColor));
        genericToastImageType.setImageResource(imageBackroundType);
        materialCardView.setCardBackgroundColor(context.getResources().getColor(colorBackground));
    }

    private static void setColorByType(Activity activity, String type, String mode, MaterialCardView materialCardView, TextView title, TextView message, ImageView genericToastImageType) {


        if(mode.equals(DARK)){
            message.setTextColor(activity.getResources().getColor(R.color.gt_message_default_color_dark));
            switch (type) {
                case SUCCESS:
                    setColorToCard(materialCardView, activity, R.color.gt_card_success_background_dark, title, R.color.gt_title_default_color_dark, genericToastImageType, R.drawable.gt_success_image);
                    break;
                case ERROR:
                    setColorToCard(materialCardView, activity, R.color.gt_card_error_background_dark, title, R.color.gt_title_default_color_dark, genericToastImageType, R.drawable.gt_error_image);
                    break;
                case WARNING:
                    setColorToCard(materialCardView, activity, R.color.gt_card_warning_background_dark, title, R.color.gt_title_default_color_dark, genericToastImageType, R.drawable.gt_warning_image);
                    break;
                case INFO:
                    setColorToCard(materialCardView, activity, R.color.gt_card_info_background_dark, title, R.color.gt_title_default_color_dark, genericToastImageType, R.drawable.gt_info_image);
                    break;
                default:
                    setColorToCard(materialCardView, activity, R.color.gt_card_custom_background_dark, title, R.color.gt_title_default_color_dark, genericToastImageType, R.drawable.gt_custom_image);
                    break;
            }
        }else{
            message.setTextColor(activity.getResources().getColor(R.color.gt_message_default_color_lite));
            switch (type) {
                case SUCCESS:
                    setColorToCard(materialCardView, activity, R.color.gt_card_success_background_lite, title, R.color.gt_title_success_color_lite, genericToastImageType, R.drawable.gt_success_image);
                    break;
                case ERROR:
                    setColorToCard(materialCardView, activity, R.color.gt_card_error_background_lite, title, R.color.gt_title_error_color_lite, genericToastImageType, R.drawable.gt_error_image);
                    break;
                case WARNING:
                    setColorToCard(materialCardView, activity, R.color.gt_card_warning_background_lite, title, R.color.gt_title_warning_color_lite, genericToastImageType, R.drawable.gt_warning_image);
                    break;
                case INFO:
                    setColorToCard(materialCardView, activity, R.color.gt_card_info_background_lite, title, R.color.gt_title_info_color_lite, genericToastImageType, R.drawable.gt_info_image);
                    break;
                default:
                    setColorToCard(materialCardView, activity, R.color.gt_card_custom_background_lite, title, R.color.gt_title_custom_color_lite, genericToastImageType, R.drawable.gt_custom_image);
                    break;
            }
        }

    }

    private static void setColorByType(Context context, String type, String mode, MaterialCardView materialCardView, TextView title, TextView message, ImageView genericToastImageType) {


        if(mode.equals(DARK)){
            message.setTextColor(context.getResources().getColor(R.color.gt_message_default_color_dark));
            switch (type) {
                case SUCCESS:
                    setColorToCard(materialCardView, context, R.color.gt_card_success_background_dark, title, R.color.gt_title_default_color_dark, genericToastImageType, R.drawable.gt_success_image);
                    break;
                case ERROR:
                    setColorToCard(materialCardView, context, R.color.gt_card_error_background_dark, title, R.color.gt_title_default_color_dark, genericToastImageType, R.drawable.gt_error_image);
                    break;
                case WARNING:
                    setColorToCard(materialCardView, context, R.color.gt_card_warning_background_dark, title, R.color.gt_title_default_color_dark, genericToastImageType, R.drawable.gt_warning_image);
                    break;
                case INFO:
                    setColorToCard(materialCardView, context, R.color.gt_card_info_background_dark, title, R.color.gt_title_default_color_dark, genericToastImageType, R.drawable.gt_info_image);
                    break;
                default:
                    setColorToCard(materialCardView, context, R.color.gt_card_custom_background_dark, title, R.color.gt_title_default_color_dark, genericToastImageType, R.drawable.gt_custom_image);
                    break;
            }
        }else{
            message.setTextColor(context.getResources().getColor(R.color.gt_message_default_color_lite));
            switch (type) {
                case SUCCESS:
                    setColorToCard(materialCardView, context, R.color.gt_card_success_background_lite, title, R.color.gt_title_success_color_lite, genericToastImageType, R.drawable.gt_success_image);
                    break;
                case ERROR:
                    setColorToCard(materialCardView, context, R.color.gt_card_error_background_lite, title, R.color.gt_title_error_color_lite, genericToastImageType, R.drawable.gt_error_image);
                    break;
                case WARNING:
                    setColorToCard(materialCardView, context, R.color.gt_card_warning_background_lite, title, R.color.gt_title_warning_color_lite, genericToastImageType, R.drawable.gt_warning_image);
                    break;
                case INFO:
                    setColorToCard(materialCardView, context, R.color.gt_card_info_background_lite, title, R.color.gt_title_info_color_lite, genericToastImageType, R.drawable.gt_info_image);
                    break;
                default:
                    setColorToCard(materialCardView, context, R.color.gt_card_custom_background_lite, title, R.color.gt_title_custom_color_lite, genericToastImageType, R.drawable.gt_custom_image);
                    break;
            }
        }

    }
}
