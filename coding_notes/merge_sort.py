def merge_sort(arr):
    if len(arr) > 1:
        # arr splicing
        left_arr = arr[:len(arr)//2]
        right_arr = arr[len(arr)//2:]

        #dividing
        merge_sort(left_arr)
        merge_sort(right_arr)

        i = 0 #left arr index
        j = 0 #right arr index
        k = 0 #merged arr index

        #merging
        while i < len(left_arr) and j < len(right_arr):
            if left_arr[i] < right_arr[j]:
                arr[k] = left_arr[i]
                i+=1
            else:
                arr[k] = right_arr[j]
                j+=1
            k+=1

        #loops to deal with left over numbers!
        while i < len(left_arr):
            arr[k] = left_arr[i]
            i+=1
            k+=1
        
        while j < len(right_arr):
            arr[k] = right_arr[j]
            j+=1
            k+=1


arr = [2,4,1,3]
merge_sort(arr)
print(arr)
print(len(arr))


