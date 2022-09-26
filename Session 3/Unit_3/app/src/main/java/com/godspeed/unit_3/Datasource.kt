import com.godspeed.unit_3.Affirmation
import com.godspeed.unit_3.R

class Datasource() {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation("Life is too short to be sad", R.drawable.image1),
            Affirmation("Have Fun !", R.drawable.imag2),
            Affirmation("Never Regret anything that made you smile !", R.drawable.image3),
            Affirmation("Every Moment is fresh beginning", R.drawable.image4),
            Affirmation("Don't just exist, LIVE !", R.drawable.image5),
            Affirmation("It's just a bad day, not a bad life.", R.drawable.image6),
        )
    }
}