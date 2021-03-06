package com.jason.trip.custom.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import android.support.annotation.ColorRes;
import android.support.annotation.DimenRes;
import android.support.design.widget.FloatingActionButton;
import android.util.AttributeSet;

import com.jason.trip.R;

/**
 * Version V1.0 <Trip客户端>
 * ClassName:AddFloatingActionButton
 * Description:
 * Created by Jason on 16/9/6.
 */
public class AddFloatingActionButton extends FloatingActionButton {
    public Drawable mIconDrawable;
    int mPlusColor;
    int mFabColor;


    public AddFloatingActionButton(Context context) {
        this(context, null);
    }

    public AddFloatingActionButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context,attrs);
        setRippleColor(mFabColor);
    }

    public AddFloatingActionButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context,attrs);
        setBackgroundColor(mFabColor);
    }


    public void init(Context context, AttributeSet attributeSet) {
        TypedArray attr = context.obtainStyledAttributes(attributeSet, R.styleable.AddFloatingActionButton, 0, 0);
        mPlusColor = attr.getColor(R.styleable.AddFloatingActionButton_fab_plusIconColor, getColor(R.color.colorWhite));
        mFabColor=attr.getColor(R.styleable.AddFloatingActionButton_fab_colorNormal,getColor(R.color.colorPrimary));
        attr.recycle();
    }

    @Override
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
    }

    /**
     * @return the current Color of plus icon.
     */
    public int getPlusColor() {
        return mPlusColor;
    }

    public void setPlusColorResId(@ColorRes int plusColor) {
        setPlusColor(getColor(plusColor));
    }

    public void setPlusColor(int color) {
        if (mPlusColor != color) {
            mPlusColor = color;
        }
    }



    Drawable getIconDrawable() {
        final float iconSize = getDimension(R.dimen.fab_icon_size);
        final float iconHalfSize = iconSize / 2f;

        final float plusSize = getDimension(R.dimen.fab_plus_icon_size);
        final float plusHalfStroke = getDimension(R.dimen.fab_plus_icon_stroke) / 2f;
        final float plusOffset = (iconSize - plusSize) / 2f;

        final Shape shape = new Shape() {
            @Override
            public void draw(Canvas canvas, Paint paint) {
                canvas.drawRect(plusOffset, iconHalfSize - plusHalfStroke, iconSize - plusOffset, iconHalfSize + plusHalfStroke, paint);
                canvas.drawRect(iconHalfSize - plusHalfStroke, plusOffset, iconHalfSize + plusHalfStroke, iconSize - plusOffset, paint);
            }
        };

        ShapeDrawable drawable = new ShapeDrawable(shape);

        final Paint paint = drawable.getPaint();
        paint.setColor(mPlusColor);
        paint.setStyle(Style.FILL);
        paint.setAntiAlias(true);

        return drawable;
    }

    int getColor(@ColorRes int id) {
        return getResources().getColor(id);
    }

    float getDimension(@DimenRes int id) {
        return getResources().getDimension(id);
    }

    public void setIconDrawable(Drawable iconDrawable){
        if(mIconDrawable!=iconDrawable){
            mIconDrawable=iconDrawable;
        }
    }


}
