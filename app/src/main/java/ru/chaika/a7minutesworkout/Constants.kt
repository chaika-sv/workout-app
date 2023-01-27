package ru.chaika.a7minutesworkout

import java.util.ArrayList

object Constants {

    fun defaultExerciseList(): ArrayList<ExerciseModel> {

        val exerciseList = ArrayList<ExerciseModel>()

        val jumpingJacks = ExerciseModel(1, "Прыжки", R.drawable.ic_jumping_jacks, false, false)
        exerciseList.add(jumpingJacks)

        val wallSit = ExerciseModel(2, "Сидение у стены", R.drawable.ic_wall_sit, false, false)
        exerciseList.add(wallSit)

        val pushUp = ExerciseModel(3, "Отжимания", R.drawable.ic_push_up, false, false)
        exerciseList.add(pushUp)

        val abdominalCrunch = ExerciseModel(4, "Складка", R.drawable.ic_abdominal_crunch, false, false)
        exerciseList.add(abdominalCrunch)

        val stepUpOnChair = ExerciseModel(5, "Шаги на стул", R.drawable.ic_step_up_onto_chair,false, false)
        exerciseList.add(stepUpOnChair)

        val squat = ExerciseModel(6, "Приседания", R.drawable.ic_squat, false, false)
        exerciseList.add(squat)

        val tricepDipOnChair = ExerciseModel( 7, "Отжимания на стуле", R.drawable.ic_triceps_dip_on_chair, false, false)
        exerciseList.add(tricepDipOnChair)

        val plank = ExerciseModel(8, "Планка", R.drawable.ic_plank, false, false)
        exerciseList.add(plank)

        val highKneesRunningInPlace = ExerciseModel(9, "Бег с поднимание коленей", R.drawable.ic_high_knees_running_in_place, false,false)
        exerciseList.add(highKneesRunningInPlace)

        val lunges = ExerciseModel(10, "Выпады", R.drawable.ic_lunge, false, false)
        exerciseList.add(lunges)

        val pushupAndRotation = ExerciseModel(11, "Отжимания с поворотами", R.drawable.ic_push_up_and_rotation, false, false)
        exerciseList.add(pushupAndRotation)

        val sidePlank = ExerciseModel(12, "Боковая планка", R.drawable.ic_side_plank, false, false)
        exerciseList.add(sidePlank)

        return exerciseList
    }

}